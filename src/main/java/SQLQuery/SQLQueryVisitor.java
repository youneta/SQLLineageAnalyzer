// Generated from C:/Users/15256/Desktop/±œ…Ë/SQLAnalyzer/src/main\SQLQuery.g4 by ANTLR 4.10.1
package SQLQuery;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLQueryParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLQueryParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLQueryParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLQueryParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLQueryParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#foreign_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table_name(SQLQueryParser.Foreign_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_column_name(SQLQueryParser.Target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLQueryParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLQueryParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLQueryParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLQueryParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLQueryParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#source_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_column_name(SQLQueryParser.Source_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(SQLQueryParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(SQLQueryParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLQueryParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SQLQueryParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(SQLQueryParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(SQLQueryParser.Drop_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(SQLQueryParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(SQLQueryParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(SQLQueryParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_statement(SQLQueryParser.Alter_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#select_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_elements(SQLQueryParser.Select_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLQueryParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLQueryParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLQueryParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_constaint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constaint(SQLQueryParser.Column_constaintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLQueryParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLQueryParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLQueryParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLQueryParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#target_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_column(SQLQueryParser.Target_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLQueryParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLQueryParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLQueryParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLQueryParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLQueryParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLQueryParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_sources(SQLQueryParser.Table_sourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(SQLQueryParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLQueryParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLQueryParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLQueryParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SQLQueryParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expression(SQLQueryParser.Logic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SQLQueryParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(SQLQueryParser.Groupby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SQLQueryParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(SQLQueryParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(SQLQueryParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(SQLQueryParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#orderby_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_expression(SQLQueryParser.Orderby_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#groupby_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_item(SQLQueryParser.Groupby_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(SQLQueryParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(SQLQueryParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#binary_calculate_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_calculate_operator(SQLQueryParser.Binary_calculate_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLQueryParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SQLQueryParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SQLQueryParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLiteral(SQLQueryParser.TextLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#select_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_element(SQLQueryParser.Select_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLQueryParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(SQLQueryParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SQLQueryParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(SQLQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(SQLQueryParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(SQLQueryParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLQueryParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(SQLQueryParser.UidContext ctx);
}