// Generated from C:/Users/15256/Desktop/±œ…Ë/SQLAnalyzer/src/main\SQLQuery.g4 by ANTLR 4.10.1
package SQLQuery;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLQueryParser}.
 */
public interface SQLQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLQueryParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLQueryParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLQueryParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLQueryParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLQueryParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLQueryParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLQueryParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLQueryParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLQueryParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLQueryParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#foreign_table_name}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table_name(SQLQueryParser.Foreign_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#foreign_table_name}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table_name(SQLQueryParser.Foreign_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterTarget_column_name(SQLQueryParser.Target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitTarget_column_name(SQLQueryParser.Target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLQueryParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLQueryParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLQueryParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLQueryParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLQueryParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLQueryParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLQueryParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLQueryParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLQueryParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLQueryParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#source_column_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_column_name(SQLQueryParser.Source_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#source_column_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_column_name(SQLQueryParser.Source_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(SQLQueryParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(SQLQueryParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(SQLQueryParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(SQLQueryParser.Create_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLQueryParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLQueryParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SQLQueryParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SQLQueryParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(SQLQueryParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(SQLQueryParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(SQLQueryParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(SQLQueryParser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(SQLQueryParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(SQLQueryParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(SQLQueryParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(SQLQueryParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(SQLQueryParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(SQLQueryParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(SQLQueryParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(SQLQueryParser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#select_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_elements(SQLQueryParser.Select_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#select_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_elements(SQLQueryParser.Select_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLQueryParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLQueryParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLQueryParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLQueryParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLQueryParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLQueryParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_constaint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constaint(SQLQueryParser.Column_constaintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_constaint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constaint(SQLQueryParser.Column_constaintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLQueryParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLQueryParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLQueryParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLQueryParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLQueryParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLQueryParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLQueryParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLQueryParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#target_column}.
	 * @param ctx the parse tree
	 */
	void enterTarget_column(SQLQueryParser.Target_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#target_column}.
	 * @param ctx the parse tree
	 */
	void exitTarget_column(SQLQueryParser.Target_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLQueryParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLQueryParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLQueryParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLQueryParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLQueryParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLQueryParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLQueryParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLQueryParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLQueryParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLQueryParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLQueryParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLQueryParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(SQLQueryParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(SQLQueryParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(SQLQueryParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(SQLQueryParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLQueryParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLQueryParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLQueryParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLQueryParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLQueryParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLQueryParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SQLQueryParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SQLQueryParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expression(SQLQueryParser.Logic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expression(SQLQueryParser.Logic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SQLQueryParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SQLQueryParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(SQLQueryParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(SQLQueryParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(SQLQueryParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(SQLQueryParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(SQLQueryParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(SQLQueryParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(SQLQueryParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(SQLQueryParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(SQLQueryParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(SQLQueryParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#orderby_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_expression(SQLQueryParser.Orderby_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#orderby_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_expression(SQLQueryParser.Orderby_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(SQLQueryParser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(SQLQueryParser.Groupby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(SQLQueryParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(SQLQueryParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(SQLQueryParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(SQLQueryParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#binary_calculate_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_calculate_operator(SQLQueryParser.Binary_calculate_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#binary_calculate_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_calculate_operator(SQLQueryParser.Binary_calculate_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLQueryParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLQueryParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLQueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLQueryParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SQLQueryParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SQLQueryParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(SQLQueryParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(SQLQueryParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#select_element}.
	 * @param ctx the parse tree
	 */
	void enterSelect_element(SQLQueryParser.Select_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#select_element}.
	 * @param ctx the parse tree
	 */
	void exitSelect_element(SQLQueryParser.Select_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLQueryParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLQueryParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SQLQueryParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SQLQueryParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQLQueryParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQLQueryParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(SQLQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(SQLQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SQLQueryParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SQLQueryParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SQLQueryParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SQLQueryParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLQueryParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLQueryParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SQLQueryParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SQLQueryParser.UidContext ctx);
}