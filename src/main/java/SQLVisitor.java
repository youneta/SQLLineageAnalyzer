import SQLQuery.SQLQueryLexer;
import SQLQuery.SQLQueryParser;
import SQLQuery.SQLQueryBaseVisitor;
import SQLQuery.SQLQueryBaseListener;
import com.google.common.collect.Table;
import models.ColumnLineageModel;
import models.TableLineageModel;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.util.Optional;

public class SQLVisitor extends SQLQueryBaseVisitor{
    public static final String defaultColumnName = "DEFAULT_COL";
    public static final String defaultTableName = "DEFAULT_TABLE";

    @Override
    public Object visitCreate_table_statement(SQLQueryParser.Create_table_statementContext ctx) {
        TableLineageModel res_table = new TableLineageModel();

        if (ctx.database_name() != null) {
            res_table.tableName = ctx.database_name().getText() + "." + ctx.table_name().getText();
        }
        else res_table.tableName = ctx.table_name().getText();
        res_table.realTableName = res_table.tableName;

        if(ctx.table_constraint() != null) {
            for(SQLQueryParser.Table_constraintContext constraintctx: ctx.table_constraint()) {
                SQLQueryParser.Table_constraint_foreign_keyContext fkctx = constraintctx.table_constraint_foreign_key();
                if(fkctx != null) {
                    for(SQLQueryParser.Source_column_nameContext namectx : fkctx.source_column_name()) {
                        res_table.columnNames.add(namectx.getText());
                    }
                    TableLineageModel fk_table = new TableLineageModel();
                    fk_table = (TableLineageModel) visit(fkctx.foreign_key_clause());
                    res_table.sourceTables.add(fk_table);
                }
            }
        }
        return res_table;
    }


    @Override
    public Object visitSelect_statement(SQLQueryParser.Select_statementContext ctx) {
        TableLineageModel res_table = new TableLineageModel();
        ArrayList<ColumnLineageModel> colLineages = new ArrayList<>();
        res_table.tableName = "select_result";
        for(SQLQueryParser.Select_elementContext selEleCtx: ctx.select_elements().select_element()) {
            ColumnLineageModel colLineage =  (ColumnLineageModel) visit(selEleCtx);
            colLineages.add(colLineage);
            if(!res_table.columnNames.contains(colLineage.columnName)) res_table.columnNames.add(colLineage.columnName);
        }
        res_table.process = "select";

        if(ctx.table_sources().join_clause()!=null) { // join_clause
            TableLineageModel table_join = new TableLineageModel();
            table_join = (TableLineageModel) visit(ctx.table_sources().join_clause());
            table_join.columnNames = res_table.columnNames;
            table_join.tableName = "join_result";
            table_join.process = "join";
            res_table.sourceTables.add(table_join);
        }
        else { // (table_reference, table_reference*)
            for(SQLQueryParser.Table_referenceContext tableRefCtx : ctx.table_sources().table_reference()) {
                TableLineageModel table_ref = new TableLineageModel();
                table_ref.tableName = defaultTableName;
                table_ref = (TableLineageModel) visit(tableRefCtx);
                table_ref.process = "selected";
                res_table.sourceTables.add(table_ref);
            }
            // 处理字段血缘
            if(res_table.sourceTables.size() == 1) {
//                res_table.sourceTables.get(0).columnNames = res_table.columnNames;
                for(ColumnLineageModel col:colLineages) {
                    if(col.srcCol!= null && !col.srcCol.isEmpty()) {
                        for(ColumnLineageModel srcCol :col.srcCol){
                            if(!res_table.sourceTables.get(0).columnNames.contains(col.columnName))
                                res_table.sourceTables.get(0).columnNames.add(srcCol.columnName);
                        }
                    }
                    else if(col.srcCol == null || col.srcCol.isEmpty()) {
                        if(!res_table.sourceTables.get(0).columnNames.contains(col.columnName))
                        res_table.sourceTables.get(0).columnNames.add(col.columnName);
                    }
                }
            }
            else {
                for(TableLineageModel srcTable:res_table.sourceTables) {
                    for(ColumnLineageModel col:colLineages) {
                        if(col.srcCol!= null && !col.srcCol.isEmpty()) {
                            for (ColumnLineageModel srcCol : col.srcCol) {
                                if(srcCol.tableName.equals(srcTable.tableName) && !srcTable.columnNames.contains(srcCol.columnName)) srcTable.columnNames.add(srcCol.columnName);
                            }
                        }
                    }
                }
            }
        }
        return res_table;
//        return super.visitSelect_statement(ctx);
    }

    @Override
    public Object visitJoin_clause(SQLQueryParser.Join_clauseContext ctx) {
        TableLineageModel res_table = new TableLineageModel();
        res_table.tableName = "join_result";
        res_table.process = "join";
        for(SQLQueryParser.Table_referenceContext tableRefCtx : ctx.table_reference()) {
            TableLineageModel table_ref = new TableLineageModel();
            table_ref.tableName = defaultTableName;
            table_ref = (TableLineageModel) visit(tableRefCtx);
            res_table.sourceTables.add(table_ref);
        }
        return res_table;
//        return super.visitJoin_clause(ctx);
    }

    @Override
    public Object visitSelect_element(SQLQueryParser.Select_elementContext ctx) {
        ColumnLineageModel res_column = new ColumnLineageModel();
        if(ctx.getText().equals("*")) {
            res_column.columnName = "*";
        }
        else if(ctx.column_name()!=null) {
            res_column.columnName = ctx.column_name().getText();
            if(ctx.table_name()!=null) {
                if(ctx.database_name()!=null)
                    res_column.tableName = ctx.database_name().getText() + "." + ctx.table_name().getText();
                else res_column.tableName = ctx.table_name().getText();
            }

        }
        else if(ctx.functionCall()!=null) {
            res_column.columnName = ctx.functionCall().getText();
        }
        else{
            if(ctx.uid()!=null) res_column.columnName = ctx.uid().getText();
            else res_column.columnName = defaultColumnName;
            res_column.process = ctx.logic_expression().getText();
            Object exprRes = visit(ctx.logic_expression());
            if(exprRes instanceof ArrayList<?>) {
                res_column.srcCol = (ArrayList<ColumnLineageModel>) exprRes;
            }

        }
        return res_column;
    }

    @Override
    public Object visitTable_reference(SQLQueryParser.Table_referenceContext ctx) {
        TableLineageModel res_table = new TableLineageModel();
        if(ctx.table_name()!=null) {
            // table_name
            if(ctx.database_name()!=null) {
                res_table.tableName = ctx.database_name().getText() + "." + ctx.table_name().getText();
            }
            else res_table.tableName = ctx.table_name().getText();
            res_table.realTableName = res_table.tableName;

            if(ctx.uid()!=null) {
                res_table.tableName = ctx.uid().getText();
                res_table.uid = res_table.tableName;
            }
        }
        else if(ctx.select_statement() != null) {
            // select_statement
            res_table = (TableLineageModel) visit(ctx.select_statement());
            if(ctx.uid()!=null) {
                res_table.tableName = ctx.uid().getText();
                res_table.uid = res_table.tableName;
            }
        }
        else if(ctx.join_clause()!=null){
            // join_clause
            res_table = (TableLineageModel) visit(ctx.join_clause());
            if(ctx.uid()!=null) {
                res_table.tableName = ctx.uid().getText();
                res_table.uid = res_table.tableName;
            }
        }
        else if(ctx.table_reference()!=null) {
            //table_references
            if(ctx.table_reference().size() == 1) {
                res_table = (TableLineageModel) visit(ctx.table_reference().get(0));
            }
            else {
                for(SQLQueryParser.Table_referenceContext tableRefCtx: ctx.table_reference()) {
                    TableLineageModel table_ref = new TableLineageModel();
                    table_ref.tableName = defaultTableName;
                    table_ref = (TableLineageModel) visit(tableRefCtx);
                    res_table.sourceTables.add(table_ref);
                }
            }
        }
        return res_table;
//        return super.visitTable_reference(ctx);
    }

    @Override
    public Object visitUpdate_statement(SQLQueryParser.Update_statementContext ctx) {
        TableLineageModel resTable = new TableLineageModel();
        if(ctx.database_name()!=null) resTable.tableName = ctx.database_name().getText() + "." + ctx.table_name().getText();
        else resTable.tableName = ctx.table_name().getText();
        resTable.realTableName = resTable.tableName;
        resTable.process = "update";
        int i = 0;
        for(SQLQueryParser.Logic_expressionContext exprCtx : ctx.logic_expression()) {
            Object exprRes = visit(exprCtx);
            if(exprRes instanceof TableLineageModel) {
                resTable.columnNames.add(ctx.column_name().get(i).getText());
                resTable.sourceTables.add((TableLineageModel) exprRes);
            }
            i++;
        }
        return resTable;
    }

    @Override
    public Object visitAlter_table_statement(SQLQueryParser.Alter_table_statementContext ctx) {
        TableLineageModel res_table = new TableLineageModel();
        if (ctx.database_name() != null) {
            res_table.tableName = ctx.database_name().getText() + "." + ctx.source_table_name().getText();
        }
        else res_table.tableName = ctx.source_table_name().getText();
        res_table.realTableName = res_table.tableName;
        res_table.process = "alter table";

        // alter table add constraint
        if(ctx.alter_table_add_constraint() != null) {
            SQLQueryParser.Table_constraint_foreign_keyContext fkctx = ctx.alter_table_add_constraint().table_constraint().table_constraint_foreign_key();
            if(fkctx != null){
                for(SQLQueryParser.Source_column_nameContext namectx : fkctx.source_column_name()) {
                    res_table.columnNames.add(namectx.getText());
                }
                TableLineageModel fk_table = new TableLineageModel();
                fk_table = (TableLineageModel) visit(fkctx.foreign_key_clause());
                res_table.sourceTables.add(fk_table);
            }
        }

        // alter table add column
        if(ctx.column_def()!=null) {
            if(ctx.column_def().column_constaint()!=null) {
                // if exist foreign key constraints
                for(SQLQueryParser.Column_constaintContext colConsCtx : ctx.column_def().column_constaint()) {
                    if(colConsCtx.column_constraint_foreign_key()!=null) {
                        res_table.columnNames.add(ctx.column_def().column_name().getText());
                        TableLineageModel fk_table = new TableLineageModel();
                        fk_table = (TableLineageModel) visit(colConsCtx.column_constraint_foreign_key().foreign_key_clause());
                        res_table.sourceTables.add(fk_table);
                    }
                }
            }
        }
        return  res_table;
    }

    @Override
    public Object visitAlter_table_add_constraint(SQLQueryParser.Alter_table_add_constraintContext ctx) {
        return super.visitAlter_table_add_constraint(ctx);

    }

    @Override
    public Object visitInsert_statement(SQLQueryParser.Insert_statementContext ctx) {
        TableLineageModel res_table = new TableLineageModel();
        res_table.process = "Insert Into";
        if(ctx.database_name()!=null) {
            res_table.tableName = ctx.database_name().getText() + "." + ctx.table_name().getText();
        }
        else res_table.tableName = ctx.table_name().getText();
        res_table.realTableName = res_table.tableName;
        if(ctx.select_statement()!=null) {
            TableLineageModel table_select = new TableLineageModel();
            table_select = (TableLineageModel) visit(ctx.select_statement());
            table_select.tableName = "select_restult";
            table_select.process = "insert_into_select";
            res_table.sourceTables.add(table_select);
            res_table.columnNames = table_select.columnNames;
        }
        return res_table;
//        return super.visitInsert_statement(ctx);
    }

    @Override
    public Object visitTable_constraint_foreign_key(SQLQueryParser.Table_constraint_foreign_keyContext ctx) {
        return visit(ctx.foreign_key_clause());
    }

    @Override
    public Object visitForeign_key_clause(SQLQueryParser.Foreign_key_clauseContext ctx) {
        TableLineageModel res_table = new TableLineageModel();
        res_table.process = "foreign_key";
        res_table.tableName = ctx.foreign_table_name().getText();
        res_table.realTableName = res_table.tableName;
        for(SQLQueryParser.Target_column_nameContext namectx : ctx.target_column_name()) {
            res_table.columnNames.add(namectx.getText());
        }
        return res_table;
//        return super.visitForeign_key_clause(ctx);
    }

    @Override
    public Object visitLogic_expression(SQLQueryParser.Logic_expressionContext ctx) {
        if(ctx.column_name()!=null) {
            ArrayList<ColumnLineageModel> columnLineages = new ArrayList<>();
            ColumnLineageModel colLineage = new ColumnLineageModel();
            colLineage.columnName = ctx.column_name().getText();
            if(ctx.table_name()!=null) {
                if(ctx.database_name()!=null) {
                    colLineage.tableName = ctx.database_name().getText() + "." + ctx.table_name().getText();
                }
                else colLineage.tableName = ctx.table_name().getText();
            }
            columnLineages.add(colLineage);
            return columnLineages;
        }
        else if(ctx.unary_operator()!=null && ctx.logic_expression()!=null) {
            return visit(ctx.logic_expression().get(0));
        }
        else if(ctx.binary_calculate_operator()!=null) {
            ArrayList<ColumnLineageModel> colLineages = new ArrayList<>();
            ArrayList<ColumnLineageModel> tmpColLineages1 = (ArrayList<ColumnLineageModel>) visit(ctx.logic_expression().get(0));
            ArrayList<ColumnLineageModel> tmpColLineages2 = (ArrayList<ColumnLineageModel>) visit(ctx.logic_expression().get(1));
            if(tmpColLineages1!=null){
                for(ColumnLineageModel colLineage : tmpColLineages1) {
                    colLineages.add(colLineage);
                }
            }
            if(tmpColLineages2!=null) {
                for (ColumnLineageModel colLineage : tmpColLineages2) {
                    colLineages.add(colLineage);
                }
            }
            return colLineages;
        }
        else if(ctx.select_statement()!=null) {
            return visit(ctx.select_statement());
        }
        return super.visitLogic_expression(ctx);
    }
}
