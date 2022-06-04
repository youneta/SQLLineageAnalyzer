// Generated from C:/Users/15256/Desktop/±ÏÉè/SQLAnalyzer/src/main\SQLQuery.g4 by ANTLR 4.10.1
package SQLQuery;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ABORT=18, ACTION=19, ADD=20, ALL=21, ALTER=22, AND=23, AS=24, ASC=25, 
		AUTOINCREMENT=26, AVG=27, BETWEEN=28, BY=29, CASCADE=30, CHAR=31, CHECK=32, 
		COALESCE=33, COLLATE=34, COLUMN=35, COMMENT=36, CONFLICT=37, CONSTRAINT=38, 
		COUNT=39, CREATE=40, CROSS=41, DEFAULT=42, DEFERRABLE=43, DEFERRED=44, 
		DELETE=45, DESC=46, DISTINCT=47, DROP=48, ENABLE=49, EXISTS=50, EXIT=51, 
		FAIL=52, FALSE=53, FOREIGN=54, FROM=55, GROUP=56, HAVING=57, IF=58, IGNORE=59, 
		IMMEDIATE=60, IN=61, INDEXED=62, INITIALLY=63, INNER=64, INSERT=65, INTO=66, 
		IS=67, JOIN=68, KEY=69, LEFT=70, LIMIT=71, LIKE=72, MATCH=73, MAX=74, 
		MIN=75, NATURAL=76, NEXTVAL=77, NO=78, NOT=79, NULL=80, OF=81, OFFSET=82, 
		ON=83, ONLY=84, OR=85, ORDER=86, OUTER=87, PRIMARY=88, RECURSIVE=89, REFERENCES=90, 
		RENAME=91, REPLACE=92, RESTRICT=93, ROLLBACK=94, SELECT=95, SET=96, SUM=97, 
		TABLE=98, TO=99, TRUE=100, UNIQUE=101, UNKNOWN=102, UPDATE=103, USING=104, 
		VALUES=105, WHERE=106, WITH=107, ID=108, TEXT_STRING=109, ID_LITERAL=110, 
		REVERSE_QUOTE_ID=111, DECIMAL_LITERAL=112, NUMERIC_LITERAL=113, WS=114;
	public static final int
		RULE_table_name = 0, RULE_column_name = 1, RULE_function_name = 2, RULE_type_name = 3, 
		RULE_name = 4, RULE_foreign_table_name = 5, RULE_target_column_name = 6, 
		RULE_collation_name = 7, RULE_index_name = 8, RULE_database_name = 9, 
		RULE_source_table_name = 10, RULE_new_table_name = 11, RULE_source_column_name = 12, 
		RULE_sql_statement = 13, RULE_create_table_statement = 14, RULE_column_def = 15, 
		RULE_data_type = 16, RULE_update_statement = 17, RULE_drop_table_statement = 18, 
		RULE_delete_statement = 19, RULE_select_statement = 20, RULE_insert_statement = 21, 
		RULE_alter_table_statement = 22, RULE_select_elements = 23, RULE_alter_table_add = 24, 
		RULE_alter_table_add_constraint = 25, RULE_table_constraint = 26, RULE_column_constaint = 27, 
		RULE_table_constraint_primary_key = 28, RULE_table_constraint_key = 29, 
		RULE_table_constraint_unique = 30, RULE_table_constraint_foreign_key = 31, 
		RULE_target_column = 32, RULE_column_constraint_primary_key = 33, RULE_column_constraint_foreign_key = 34, 
		RULE_column_constraint_not_null = 35, RULE_column_constraint_null = 36, 
		RULE_column_default = 37, RULE_column_default_value = 38, RULE_table_sources = 39, 
		RULE_table_reference = 40, RULE_join_clause = 41, RULE_join_operator = 42, 
		RULE_foreign_key_clause = 43, RULE_where_clause = 44, RULE_logic_expression = 45, 
		RULE_with_clause = 46, RULE_groupby_clause = 47, RULE_having_clause = 48, 
		RULE_orderby_clause = 49, RULE_limit_clause = 50, RULE_conflict_clause = 51, 
		RULE_orderby_expression = 52, RULE_groupby_item = 53, RULE_logical_operator = 54, 
		RULE_comparison_operator = 55, RULE_binary_calculate_operator = 56, RULE_unary_operator = 57, 
		RULE_value = 58, RULE_decimalLiteral = 59, RULE_textLiteral = 60, RULE_select_element = 61, 
		RULE_cte_table_name = 62, RULE_fullColumnName = 63, RULE_functionCall = 64, 
		RULE_aggregateWindowedFunction = 65, RULE_functionArg = 66, RULE_functionArgs = 67, 
		RULE_signed_number = 68, RULE_uid = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"table_name", "column_name", "function_name", "type_name", "name", "foreign_table_name", 
			"target_column_name", "collation_name", "index_name", "database_name", 
			"source_table_name", "new_table_name", "source_column_name", "sql_statement", 
			"create_table_statement", "column_def", "data_type", "update_statement", 
			"drop_table_statement", "delete_statement", "select_statement", "insert_statement", 
			"alter_table_statement", "select_elements", "alter_table_add", "alter_table_add_constraint", 
			"table_constraint", "column_constaint", "table_constraint_primary_key", 
			"table_constraint_key", "table_constraint_unique", "table_constraint_foreign_key", 
			"target_column", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "table_sources", "table_reference", "join_clause", 
			"join_operator", "foreign_key_clause", "where_clause", "logic_expression", 
			"with_clause", "groupby_clause", "having_clause", "orderby_clause", "limit_clause", 
			"conflict_clause", "orderby_expression", "groupby_item", "logical_operator", 
			"comparison_operator", "binary_calculate_operator", "unary_operator", 
			"value", "decimalLiteral", "textLiteral", "select_element", "cte_table_name", 
			"fullColumnName", "functionCall", "aggregateWindowedFunction", "functionArg", 
			"functionArgs", "signed_number", "uid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "','", "')'", "'='", "'::'", "'&'", "'|'", "'>'", 
			"'<'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ABORT", "ACTION", "ADD", "ALL", 
			"ALTER", "AND", "AS", "ASC", "AUTOINCREMENT", "AVG", "BETWEEN", "BY", 
			"CASCADE", "CHAR", "CHECK", "COALESCE", "COLLATE", "COLUMN", "COMMENT", 
			"CONFLICT", "CONSTRAINT", "COUNT", "CREATE", "CROSS", "DEFAULT", "DEFERRABLE", 
			"DEFERRED", "DELETE", "DESC", "DISTINCT", "DROP", "ENABLE", "EXISTS", 
			"EXIT", "FAIL", "FALSE", "FOREIGN", "FROM", "GROUP", "HAVING", "IF", 
			"IGNORE", "IMMEDIATE", "IN", "INDEXED", "INITIALLY", "INNER", "INSERT", 
			"INTO", "IS", "JOIN", "KEY", "LEFT", "LIMIT", "LIKE", "MATCH", "MAX", 
			"MIN", "NATURAL", "NEXTVAL", "NO", "NOT", "NULL", "OF", "OFFSET", "ON", 
			"ONLY", "OR", "ORDER", "OUTER", "PRIMARY", "RECURSIVE", "REFERENCES", 
			"RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "SELECT", "SET", "SUM", 
			"TABLE", "TO", "TRUE", "UNIQUE", "UNKNOWN", "UPDATE", "USING", "VALUES", 
			"WHERE", "WITH", "ID", "TEXT_STRING", "ID_LITERAL", "REVERSE_QUOTE_ID", 
			"DECIMAL_LITERAL", "NUMERIC_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Foreign_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterForeign_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitForeign_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitForeign_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_table_nameContext foreign_table_name() throws RecognitionException {
		Foreign_table_nameContext _localctx = new Foreign_table_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_foreign_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTarget_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTarget_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTarget_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_column_nameContext target_column_name() throws RecognitionException {
		Target_column_nameContext _localctx = new Target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public Source_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSource_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSource_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSource_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_column_nameContext source_column_name() throws RecognitionException {
		Source_column_nameContext _localctx = new Source_column_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_source_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSql_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSql_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sql_statement);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				select_statement();
				}
				break;
			case INSERT:
			case REPLACE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				delete_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				create_table_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				drop_table_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				alter_table_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLQueryParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLQueryParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode AS() { return getToken(SQLQueryParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLQueryParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SQLQueryParser.EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterCreate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitCreate_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitCreate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(CREATE);
			setState(176);
			match(TABLE);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(177);
				match(IF);
				setState(178);
				match(NOT);
				setState(179);
				match(EXISTS);
				}
			}

			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(182);
				database_name();
				setState(183);
				match(T__0);
				}
				break;
			}
			setState(187);
			table_name();
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(188);
				match(T__1);
				setState(189);
				column_def();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(190);
						match(T__2);
						setState(191);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(192);
						match(T__2);
						setState(193);
						column_def();
						}
						break;
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(T__3);
				}
				break;
			case AS:
				{
				setState(201);
				match(AS);
				setState(202);
				select_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constaintContext> column_constaint() {
			return getRuleContexts(Column_constaintContext.class);
		}
		public Column_constaintContext column_constaint(int i) {
			return getRuleContext(Column_constaintContext.class,i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			column_name();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHECK) | (1L << COLLATE) | (1L << CONSTRAINT) | (1L << DEFAULT))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NOT - 79)) | (1L << (NULL - 79)) | (1L << (PRIMARY - 79)) | (1L << (REFERENCES - 79)) | (1L << (UNIQUE - 79)) | (1L << (ID - 79)))) != 0)) {
				{
				setState(208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHECK:
				case COLLATE:
				case CONSTRAINT:
				case DEFAULT:
				case NOT:
				case NULL:
				case PRIMARY:
				case REFERENCES:
				case UNIQUE:
					{
					setState(206);
					column_constaint();
					}
					break;
				case ID:
					{
					setState(207);
					data_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			type_name();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(214);
				match(T__1);
				setState(215);
				signed_number();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(216);
					name();
					}
				}

				setState(219);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(221);
				match(T__1);
				setState(222);
				signed_number();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(223);
					name();
					}
				}

				setState(226);
				match(T__2);
				setState(227);
				signed_number();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(228);
					name();
					}
				}

				setState(231);
				match(T__3);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLQueryParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SQLQueryParser.SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SQLQueryParser.OR, 0); }
		public TerminalNode ROLLBACK() { return getToken(SQLQueryParser.ROLLBACK, 0); }
		public TerminalNode ABORT() { return getToken(SQLQueryParser.ABORT, 0); }
		public TerminalNode REPLACE() { return getToken(SQLQueryParser.REPLACE, 0); }
		public TerminalNode FAIL() { return getToken(SQLQueryParser.FAIL, 0); }
		public TerminalNode IGNORE() { return getToken(SQLQueryParser.IGNORE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode INDEXED() { return getToken(SQLQueryParser.INDEXED, 0); }
		public TerminalNode BY() { return getToken(SQLQueryParser.BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(UPDATE);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(236);
				match(OR);
				setState(237);
				match(ROLLBACK);
				}
				break;
			case 2:
				{
				setState(238);
				match(OR);
				setState(239);
				match(ABORT);
				}
				break;
			case 3:
				{
				setState(240);
				match(OR);
				setState(241);
				match(REPLACE);
				}
				break;
			case 4:
				{
				setState(242);
				match(OR);
				setState(243);
				match(FAIL);
				}
				break;
			case 5:
				{
				setState(244);
				match(OR);
				setState(245);
				match(IGNORE);
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(248);
				database_name();
				setState(249);
				match(T__0);
				}
				break;
			}
			setState(253);
			table_name();
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEXED:
				{
				setState(254);
				match(INDEXED);
				setState(255);
				match(BY);
				setState(256);
				index_name();
				}
				break;
			case NOT:
				{
				setState(257);
				match(NOT);
				setState(258);
				match(INDEXED);
				}
				break;
			case SET:
				break;
			default:
				break;
			}
			setState(261);
			match(SET);
			setState(262);
			column_name();
			setState(263);
			match(T__4);
			setState(264);
			logic_expression(0);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(265);
				match(T__2);
				setState(266);
				column_name();
				setState(267);
				match(T__4);
				setState(268);
				logic_expression(0);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(275);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLQueryParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLQueryParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLQueryParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLQueryParser.EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterDrop_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitDrop_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitDrop_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(DROP);
			setState(279);
			match(TABLE);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(280);
				match(IF);
				setState(281);
				match(EXISTS);
				}
			}

			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(284);
				database_name();
				setState(285);
				match(T__0);
				}
				break;
			}
			setState(289);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLQueryParser.DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLQueryParser.FROM, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode INDEXED() { return getToken(SQLQueryParser.INDEXED, 0); }
		public TerminalNode BY() { return getToken(SQLQueryParser.BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(DELETE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(292);
				match(FROM);
				}
			}

			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(295);
				database_name();
				setState(296);
				match(T__0);
				}
				break;
			}
			setState(300);
			table_name();
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEXED:
				{
				setState(301);
				match(INDEXED);
				setState(302);
				match(BY);
				setState(303);
				index_name();
				}
				break;
			case NOT:
				{
				setState(304);
				match(NOT);
				setState(305);
				match(INDEXED);
				}
				break;
			case EOF:
			case WHERE:
				break;
			default:
				break;
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(308);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLQueryParser.SELECT, 0); }
		public Select_elementsContext select_elements() {
			return getRuleContext(Select_elementsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SQLQueryParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SQLQueryParser.FROM, 0); }
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(SELECT);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(312);
				match(DISTINCT);
				}
			}

			setState(315);
			select_elements();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(316);
				match(FROM);
				setState(317);
				table_sources();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(318);
					where_clause();
					}
				}

				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(321);
					groupby_clause();
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(324);
					having_clause();
					}
				}

				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(329);
				orderby_clause();
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(332);
				limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(SQLQueryParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(SQLQueryParser.INSERT, 0); }
		public TerminalNode REPLACE() { return getToken(SQLQueryParser.REPLACE, 0); }
		public TerminalNode OR() { return getToken(SQLQueryParser.OR, 0); }
		public TerminalNode ROLLBACK() { return getToken(SQLQueryParser.ROLLBACK, 0); }
		public TerminalNode ABORT() { return getToken(SQLQueryParser.ABORT, 0); }
		public TerminalNode FAIL() { return getToken(SQLQueryParser.FAIL, 0); }
		public TerminalNode IGNORE() { return getToken(SQLQueryParser.IGNORE, 0); }
		public TerminalNode VALUES() { return getToken(SQLQueryParser.VALUES, 0); }
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLQueryParser.DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLQueryParser.TABLE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(335);
				with_clause();
				}
			}

			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(338);
				match(INSERT);
				}
				break;
			case 2:
				{
				setState(339);
				match(REPLACE);
				}
				break;
			case 3:
				{
				setState(340);
				match(INSERT);
				setState(341);
				match(OR);
				setState(342);
				match(REPLACE);
				}
				break;
			case 4:
				{
				setState(343);
				match(INSERT);
				setState(344);
				match(OR);
				setState(345);
				match(ROLLBACK);
				}
				break;
			case 5:
				{
				setState(346);
				match(INSERT);
				setState(347);
				match(OR);
				setState(348);
				match(ABORT);
				}
				break;
			case 6:
				{
				setState(349);
				match(INSERT);
				setState(350);
				match(OR);
				setState(351);
				match(FAIL);
				}
				break;
			case 7:
				{
				setState(352);
				match(INSERT);
				setState(353);
				match(OR);
				setState(354);
				match(IGNORE);
				}
				break;
			}
			setState(357);
			match(INTO);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(358);
				match(TABLE);
				}
			}

			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(361);
				database_name();
				setState(362);
				match(T__0);
				}
				break;
			}
			setState(366);
			table_name();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(367);
				match(T__1);
				setState(368);
				column_name();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(369);
					match(T__2);
					setState(370);
					column_name();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(T__3);
				}
			}

			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(380);
				match(VALUES);
				setState(381);
				match(T__1);
				setState(382);
				logic_expression(0);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(383);
					match(T__2);
					setState(384);
					logic_expression(0);
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(T__3);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(391);
					match(T__2);
					setState(392);
					match(T__1);
					setState(393);
					logic_expression(0);
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(394);
						match(T__2);
						setState(395);
						logic_expression(0);
						}
						}
						setState(400);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(401);
					match(T__3);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SELECT:
				{
				setState(408);
				select_statement();
				}
				break;
			case DEFAULT:
				{
				setState(409);
				match(DEFAULT);
				setState(410);
				match(VALUES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLQueryParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLQueryParser.TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SQLQueryParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SQLQueryParser.TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SQLQueryParser.ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(SQLQueryParser.ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(SQLQueryParser.ENABLE, 0); }
		public TerminalNode COLUMN() { return getToken(SQLQueryParser.COLUMN, 0); }
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterAlter_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitAlter_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAlter_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(ALTER);
			setState(414);
			match(TABLE);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(415);
				match(ONLY);
				}
			}

			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(418);
				database_name();
				setState(419);
				match(T__0);
				}
				break;
			}
			setState(423);
			source_table_name();
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(424);
				match(RENAME);
				setState(425);
				match(TO);
				setState(426);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(427);
				alter_table_add_constraint();
				}
				break;
			case 3:
				{
				setState(428);
				match(ADD);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(429);
					match(COLUMN);
					}
				}

				setState(432);
				column_def();
				}
				break;
			}
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENABLE) {
				{
				setState(435);
				match(ENABLE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_elementsContext extends ParserRuleContext {
		public List<Select_elementContext> select_element() {
			return getRuleContexts(Select_elementContext.class);
		}
		public Select_elementContext select_element(int i) {
			return getRuleContext(Select_elementContext.class,i);
		}
		public Select_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSelect_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSelect_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSelect_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_elementsContext select_elements() throws RecognitionException {
		Select_elementsContext _localctx = new Select_elementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			select_element();
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(439);
				match(T__2);
				setState(440);
				select_element();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLQueryParser.ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(ADD);
			setState(447);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLQueryParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLQueryParser.CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ADD);
			setState(450);
			match(CONSTRAINT);
			setState(451);
			name();
			setState(452);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(SQLQueryParser.CHECK, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLQueryParser.CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(454);
				match(CONSTRAINT);
				setState(455);
				name();
				}
			}

			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(458);
				table_constraint_primary_key();
				}
				break;
			case KEY:
				{
				setState(459);
				table_constraint_key();
				}
				break;
			case UNIQUE:
				{
				setState(460);
				table_constraint_unique();
				}
				break;
			case CHECK:
				{
				setState(461);
				match(CHECK);
				setState(462);
				match(T__1);
				setState(463);
				logic_expression(0);
				setState(464);
				match(T__3);
				}
				break;
			case FOREIGN:
				{
				setState(466);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constaintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLQueryParser.UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(SQLQueryParser.CHECK, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLQueryParser.COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLQueryParser.CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constaintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constaint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_constaint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_constaint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_constaint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constaintContext column_constaint() throws RecognitionException {
		Column_constaintContext _localctx = new Column_constaintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_column_constaint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(469);
				match(CONSTRAINT);
				setState(470);
				name();
				}
			}

			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(473);
				column_constraint_primary_key();
				}
				break;
			case REFERENCES:
				{
				setState(474);
				column_constraint_foreign_key();
				}
				break;
			case NOT:
				{
				setState(475);
				column_constraint_not_null();
				}
				break;
			case NULL:
				{
				setState(476);
				column_constraint_null();
				}
				break;
			case UNIQUE:
				{
				setState(477);
				match(UNIQUE);
				setState(478);
				conflict_clause();
				}
				break;
			case CHECK:
				{
				setState(479);
				match(CHECK);
				setState(480);
				match(T__1);
				setState(481);
				logic_expression(0);
				setState(482);
				match(T__3);
				}
				break;
			case DEFAULT:
				{
				setState(484);
				column_default();
				}
				break;
			case COLLATE:
				{
				setState(485);
				match(COLLATE);
				setState(486);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLQueryParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLQueryParser.KEY, 0); }
		public List<Target_columnContext> target_column() {
			return getRuleContexts(Target_columnContext.class);
		}
		public Target_columnContext target_column(int i) {
			return getRuleContext(Target_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(PRIMARY);
			setState(490);
			match(KEY);
			setState(491);
			match(T__1);
			setState(492);
			target_column();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(493);
				match(T__2);
				setState(494);
				target_column();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(T__3);
			setState(501);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(SQLQueryParser.KEY, 0); }
		public List<Target_columnContext> target_column() {
			return getRuleContexts(Target_columnContext.class);
		}
		public Target_columnContext target_column(int i) {
			return getRuleContext(Target_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(KEY);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(504);
				name();
				}
			}

			setState(507);
			match(T__1);
			setState(508);
			target_column();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(509);
				match(T__2);
				setState(510);
				target_column();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(T__3);
			setState(517);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(SQLQueryParser.UNIQUE, 0); }
		public List<Target_columnContext> target_column() {
			return getRuleContexts(Target_columnContext.class);
		}
		public Target_columnContext target_column(int i) {
			return getRuleContext(Target_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode KEY() { return getToken(SQLQueryParser.KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(UNIQUE);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(520);
				match(KEY);
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(523);
				name();
				}
			}

			setState(526);
			match(T__1);
			setState(527);
			target_column();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(528);
				match(T__2);
				setState(529);
				target_column();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(T__3);
			setState(536);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(SQLQueryParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLQueryParser.KEY, 0); }
		public List<Source_column_nameContext> source_column_name() {
			return getRuleContexts(Source_column_nameContext.class);
		}
		public Source_column_nameContext source_column_name(int i) {
			return getRuleContext(Source_column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(FOREIGN);
			setState(539);
			match(KEY);
			setState(540);
			match(T__1);
			setState(541);
			source_column_name();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(542);
				match(T__2);
				setState(543);
				source_column_name();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(T__3);
			setState(550);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLQueryParser.COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLQueryParser.DESC, 0); }
		public Target_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTarget_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTarget_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTarget_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_columnContext target_column() throws RecognitionException {
		Target_columnContext _localctx = new Target_columnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_target_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			column_name();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(553);
				match(COLLATE);
				setState(554);
				collation_name();
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLQueryParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLQueryParser.KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode AUTOINCREMENT() { return getToken(SQLQueryParser.AUTOINCREMENT, 0); }
		public TerminalNode ASC() { return getToken(SQLQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLQueryParser.DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(PRIMARY);
			setState(561);
			match(KEY);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(562);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(565);
			conflict_clause();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTOINCREMENT) {
				{
				setState(566);
				match(AUTOINCREMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLQueryParser.NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(NOT);
			setState(572);
			match(NULL);
			setState(573);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(SQLQueryParser.NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(NULL);
			setState(576);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLQueryParser.DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public TerminalNode NEXTVAL() { return getToken(SQLQueryParser.NEXTVAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(DEFAULT);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(579);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(580);
				match(T__1);
				setState(581);
				logic_expression(0);
				setState(582);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(584);
				match(NEXTVAL);
				setState(585);
				match(T__1);
				setState(586);
				logic_expression(0);
				setState(587);
				match(T__3);
				}
				break;
			case 4:
				{
				setState(589);
				name();
				}
				break;
			}
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(592);
				match(T__5);
				setState(594); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(593);
						name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(596); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case NUMERIC_LITERAL:
				{
				setState(600);
				signed_number();
				}
				break;
			case ID:
			case TEXT_STRING:
			case DECIMAL_LITERAL:
				{
				setState(601);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_sourcesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Table_sourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_sources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_sources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_sources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_sources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourcesContext table_sources() throws RecognitionException {
		Table_sourcesContext _localctx = new Table_sourcesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_table_sources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(604);
				table_reference();
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(605);
					match(T__2);
					setState(606);
					table_reference();
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(612);
				join_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode INDEXED() { return getToken(SQLQueryParser.INDEXED, 0); }
		public TerminalNode BY() { return getToken(SQLQueryParser.BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public TerminalNode AS() { return getToken(SQLQueryParser.AS, 0); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_table_reference);
		int _la;
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(615);
					database_name();
					setState(616);
					match(T__0);
					}
					break;
				}
				setState(620);
				table_name();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(621);
						match(AS);
						}
					}

					setState(624);
					uid();
					}
				}

				setState(632);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEXED:
					{
					setState(627);
					match(INDEXED);
					setState(628);
					match(BY);
					setState(629);
					index_name();
					}
					break;
				case NOT:
					{
					setState(630);
					match(NOT);
					setState(631);
					match(INDEXED);
					}
					break;
				case EOF:
				case T__2:
				case T__3:
				case CROSS:
				case GROUP:
				case HAVING:
				case INNER:
				case JOIN:
				case LEFT:
				case LIMIT:
				case NATURAL:
				case ON:
				case ORDER:
				case USING:
				case WHERE:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(T__1);
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(635);
					table_reference();
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(636);
						match(T__2);
						setState(637);
						table_reference();
						}
						}
						setState(642);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(643);
					join_clause();
					}
					break;
				}
				setState(646);
				match(T__3);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(647);
						match(AS);
						}
					}

					setState(650);
					uid();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				match(T__1);
				setState(654);
				select_statement();
				setState(655);
				match(T__3);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(656);
						match(AS);
						}
					}

					setState(659);
					uid();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<TerminalNode> ON() { return getTokens(SQLQueryParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLQueryParser.ON, i);
		}
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public List<TerminalNode> USING() { return getTokens(SQLQueryParser.USING); }
		public TerminalNode USING(int i) {
			return getToken(SQLQueryParser.USING, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			table_reference();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==CROSS || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (JOIN - 64)) | (1L << (LEFT - 64)) | (1L << (NATURAL - 64)))) != 0)) {
				{
				{
				setState(665);
				join_operator();
				setState(666);
				table_reference();
				setState(681);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(667);
					match(ON);
					setState(668);
					logic_expression(0);
					}
					break;
				case USING:
					{
					setState(669);
					match(USING);
					setState(670);
					match(T__1);
					setState(671);
					column_name();
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(672);
						match(T__2);
						setState(673);
						column_name();
						}
						}
						setState(678);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(679);
					match(T__3);
					}
					break;
				case EOF:
				case T__2:
				case T__3:
				case CROSS:
				case GROUP:
				case HAVING:
				case INNER:
				case JOIN:
				case LEFT:
				case LIMIT:
				case NATURAL:
				case ORDER:
				case WHERE:
					break;
				default:
					break;
				}
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SQLQueryParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(SQLQueryParser.NATURAL, 0); }
		public TerminalNode LEFT() { return getToken(SQLQueryParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(SQLQueryParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SQLQueryParser.CROSS, 0); }
		public TerminalNode OUTER() { return getToken(SQLQueryParser.OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_join_operator);
		int _la;
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(T__2);
				}
				break;
			case CROSS:
			case INNER:
			case JOIN:
			case LEFT:
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(689);
					match(NATURAL);
					}
				}

				setState(698);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT:
					{
					setState(692);
					match(LEFT);
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(693);
						match(OUTER);
						}
					}

					}
					break;
				case INNER:
					{
					setState(696);
					match(INNER);
					}
					break;
				case CROSS:
					{
					setState(697);
					match(CROSS);
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(700);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQLQueryParser.REFERENCES, 0); }
		public Foreign_table_nameContext foreign_table_name() {
			return getRuleContext(Foreign_table_nameContext.class,0);
		}
		public List<Target_column_nameContext> target_column_name() {
			return getRuleContexts(Target_column_nameContext.class);
		}
		public Target_column_nameContext target_column_name(int i) {
			return getRuleContext(Target_column_nameContext.class,i);
		}
		public TerminalNode DEFERRABLE() { return getToken(SQLQueryParser.DEFERRABLE, 0); }
		public List<TerminalNode> ON() { return getTokens(SQLQueryParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLQueryParser.ON, i);
		}
		public List<TerminalNode> MATCH() { return getTokens(SQLQueryParser.MATCH); }
		public TerminalNode MATCH(int i) {
			return getToken(SQLQueryParser.MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DELETE() { return getTokens(SQLQueryParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(SQLQueryParser.DELETE, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(SQLQueryParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(SQLQueryParser.UPDATE, i);
		}
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public TerminalNode INITIALLY() { return getToken(SQLQueryParser.INITIALLY, 0); }
		public TerminalNode DEFERRED() { return getToken(SQLQueryParser.DEFERRED, 0); }
		public TerminalNode IMMEDIATE() { return getToken(SQLQueryParser.IMMEDIATE, 0); }
		public TerminalNode ENABLE() { return getToken(SQLQueryParser.ENABLE, 0); }
		public List<TerminalNode> SET() { return getTokens(SQLQueryParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(SQLQueryParser.SET, i);
		}
		public List<TerminalNode> NULL() { return getTokens(SQLQueryParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(SQLQueryParser.NULL, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(SQLQueryParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(SQLQueryParser.DEFAULT, i);
		}
		public List<TerminalNode> CASCADE() { return getTokens(SQLQueryParser.CASCADE); }
		public TerminalNode CASCADE(int i) {
			return getToken(SQLQueryParser.CASCADE, i);
		}
		public List<TerminalNode> RESTRICT() { return getTokens(SQLQueryParser.RESTRICT); }
		public TerminalNode RESTRICT(int i) {
			return getToken(SQLQueryParser.RESTRICT, i);
		}
		public List<TerminalNode> NO() { return getTokens(SQLQueryParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(SQLQueryParser.NO, i);
		}
		public List<TerminalNode> ACTION() { return getTokens(SQLQueryParser.ACTION); }
		public TerminalNode ACTION(int i) {
			return getToken(SQLQueryParser.ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(REFERENCES);
			setState(704);
			foreign_table_name();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(705);
				match(T__1);
				setState(706);
				target_column_name();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(707);
					match(T__2);
					setState(708);
					target_column_name();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				match(T__3);
				}
			}

			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCH || _la==ON) {
				{
				{
				setState(732);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(718);
					match(ON);
					setState(719);
					_la = _input.LA(1);
					if ( !(_la==DELETE || _la==UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(728);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(720);
						match(SET);
						setState(721);
						match(NULL);
						}
						break;
					case 2:
						{
						setState(722);
						match(SET);
						setState(723);
						match(DEFAULT);
						}
						break;
					case 3:
						{
						setState(724);
						match(CASCADE);
						}
						break;
					case 4:
						{
						setState(725);
						match(RESTRICT);
						}
						break;
					case 5:
						{
						setState(726);
						match(NO);
						setState(727);
						match(ACTION);
						}
						break;
					}
					}
					break;
				case MATCH:
					{
					setState(730);
					match(MATCH);
					setState(731);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(739);
					match(NOT);
					}
				}

				setState(742);
				match(DEFERRABLE);
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(743);
					match(INITIALLY);
					setState(744);
					match(DEFERRED);
					}
					break;
				case 2:
					{
					setState(745);
					match(INITIALLY);
					setState(746);
					match(IMMEDIATE);
					}
					break;
				}
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(749);
					match(ENABLE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLQueryParser.WHERE, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(WHERE);
			setState(755);
			logic_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expressionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(SQLQueryParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLQueryParser.AND, 0); }
		public TerminalNode IN() { return getToken(SQLQueryParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Binary_calculate_operatorContext binary_calculate_operator() {
			return getRuleContext(Binary_calculate_operatorContext.class,0);
		}
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterLogic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitLogic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitLogic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		return logic_expression(0);
	}

	private Logic_expressionContext logic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, _parentState);
		Logic_expressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_logic_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(761);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						setState(758);
						database_name();
						setState(759);
						match(T__0);
						}
						break;
					}
					setState(763);
					table_name();
					setState(764);
					match(T__0);
					}
					break;
				}
				setState(768);
				column_name();
				}
				break;
			case 2:
				{
				setState(769);
				value();
				}
				break;
			case 3:
				{
				setState(770);
				unary_operator();
				setState(771);
				logic_expression(5);
				}
				break;
			case 4:
				{
				setState(773);
				fullColumnName();
				setState(774);
				match(BETWEEN);
				setState(775);
				value();
				setState(776);
				match(AND);
				setState(777);
				value();
				}
				break;
			case 5:
				{
				setState(779);
				fullColumnName();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(780);
					match(NOT);
					}
				}

				setState(783);
				match(IN);
				setState(784);
				match(T__1);
				setState(785);
				value();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(786);
					match(T__2);
					setState(787);
					value();
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(793);
				match(T__3);
				}
				break;
			case 6:
				{
				setState(795);
				match(T__1);
				setState(796);
				select_statement();
				setState(797);
				match(T__3);
				}
				break;
			case 7:
				{
				setState(799);
				match(T__1);
				setState(800);
				logic_expression(0);
				setState(801);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(817);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(805);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(806);
						logical_operator();
						setState(807);
						logic_expression(11);
						}
						break;
					case 2:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(809);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(810);
						comparison_operator();
						setState(811);
						logic_expression(8);
						}
						break;
					case 3:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(813);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(814);
						binary_calculate_operator();
						setState(815);
						logic_expression(7);
						}
						break;
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLQueryParser.WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(SQLQueryParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(SQLQueryParser.AS, i);
		}
		public List<Select_statementContext> select_statement() {
			return getRuleContexts(Select_statementContext.class);
		}
		public Select_statementContext select_statement(int i) {
			return getRuleContext(Select_statementContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SQLQueryParser.RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(WITH);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(823);
				match(RECURSIVE);
				}
			}

			setState(826);
			cte_table_name();
			setState(827);
			match(AS);
			setState(828);
			match(T__1);
			setState(829);
			select_statement();
			setState(830);
			match(T__3);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(831);
				match(T__2);
				setState(832);
				cte_table_name();
				setState(833);
				match(AS);
				setState(834);
				match(T__1);
				setState(835);
				select_statement();
				setState(836);
				match(T__3);
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SQLQueryParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLQueryParser.BY, 0); }
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitGroupby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitGroupby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(GROUP);
			setState(844);
			match(BY);
			setState(845);
			groupby_item();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(846);
				match(T__2);
				setState(847);
				groupby_item();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQLQueryParser.HAVING, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(HAVING);
			setState(854);
			logic_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLQueryParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLQueryParser.BY, 0); }
		public List<Orderby_expressionContext> orderby_expression() {
			return getRuleContexts(Orderby_expressionContext.class);
		}
		public Orderby_expressionContext orderby_expression(int i) {
			return getRuleContext(Orderby_expressionContext.class,i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitOrderby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(ORDER);
			setState(857);
			match(BY);
			setState(858);
			orderby_expression();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(859);
				match(T__2);
				setState(860);
				orderby_expression();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public DecimalLiteralContext offset;
		public DecimalLiteralContext limit;
		public TerminalNode LIMIT() { return getToken(SQLQueryParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SQLQueryParser.OFFSET, 0); }
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitLimit_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(LIMIT);
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(867);
					((Limit_clauseContext)_localctx).offset = decimalLiteral();
					setState(868);
					match(T__2);
					}
					break;
				}
				setState(872);
				((Limit_clauseContext)_localctx).limit = decimalLiteral();
				}
				break;
			case 2:
				{
				setState(873);
				((Limit_clauseContext)_localctx).limit = decimalLiteral();
				setState(874);
				match(OFFSET);
				setState(875);
				((Limit_clauseContext)_localctx).offset = decimalLiteral();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLQueryParser.ON, 0); }
		public TerminalNode CONFLICT() { return getToken(SQLQueryParser.CONFLICT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SQLQueryParser.ROLLBACK, 0); }
		public TerminalNode ABORT() { return getToken(SQLQueryParser.ABORT, 0); }
		public TerminalNode FAIL() { return getToken(SQLQueryParser.FAIL, 0); }
		public TerminalNode IGNORE() { return getToken(SQLQueryParser.IGNORE, 0); }
		public TerminalNode REPLACE() { return getToken(SQLQueryParser.REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(879);
				match(ON);
				setState(880);
				match(CONFLICT);
				setState(881);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABORT) | (1L << FAIL) | (1L << IGNORE))) != 0) || _la==REPLACE || _la==ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_expressionContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLQueryParser.DESC, 0); }
		public Orderby_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterOrderby_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitOrderby_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitOrderby_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_expressionContext orderby_expression() throws RecognitionException {
		Orderby_expressionContext _localctx = new Orderby_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_orderby_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			fullColumnName();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(885);
				((Orderby_expressionContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((Orderby_expressionContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLQueryParser.DESC, 0); }
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitGroupby_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitGroupby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_groupby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			fullColumnName();
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(889);
				((Groupby_itemContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((Groupby_itemContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SQLQueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLQueryParser.OR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_logical_operator);
		try {
			setState(898);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(AND);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(T__6);
				setState(894);
				match(T__6);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(895);
				match(OR);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(896);
				match(T__7);
				setState(897);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparison_operator);
		try {
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(903);
				match(T__9);
				setState(904);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(905);
				match(T__8);
				setState(906);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(907);
				match(T__9);
				setState(908);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(909);
				match(T__10);
				setState(910);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(911);
				match(T__9);
				setState(912);
				match(T__4);
				setState(913);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_calculate_operatorContext extends ParserRuleContext {
		public Binary_calculate_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_calculate_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterBinary_calculate_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitBinary_calculate_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitBinary_calculate_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_calculate_operatorContext binary_calculate_operator() throws RecognitionException {
		Binary_calculate_operatorContext _localctx = new Binary_calculate_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_binary_calculate_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQLQueryParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__16))) != 0) || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_value);
		try {
			setState(923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				uid();
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				textLiteral();
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				decimalLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SQLQueryParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextLiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(SQLQueryParser.TEXT_STRING, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitTextLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTextLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_textLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_elementContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLQueryParser.AS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Select_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSelect_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSelect_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSelect_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_elementContext select_element() throws RecognitionException {
		Select_elementContext _localctx = new Select_elementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_select_element);
		int _la;
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(933);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(930);
						database_name();
						setState(931);
						match(T__0);
						}
						break;
					}
					setState(935);
					table_name();
					setState(936);
					match(T__0);
					}
					break;
				}
				setState(940);
				column_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
				logic_expression(0);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(942);
						match(AS);
						}
					}

					setState(945);
					uid();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
				functionCall();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(949);
						match(AS);
						}
					}

					setState(952);
					uid();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(957);
				database_name();
				setState(958);
				match(T__0);
				}
				break;
			}
			setState(962);
			table_name();
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(963);
				match(T__1);
				setState(964);
				column_name();
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(965);
					match(T__2);
					setState(966);
					column_name();
					}
					}
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(972);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullColumnNameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitFullColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFullColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_fullColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregateWindowedFunctionContext aggregateWindowedFunction() {
			return getRuleContext(AggregateWindowedFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			aggregateWindowedFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateWindowedFunctionContext extends ParserRuleContext {
		public Token starArg;
		public Token aggregator;
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode AVG() { return getToken(SQLQueryParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(SQLQueryParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLQueryParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLQueryParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLQueryParser.COUNT, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SQLQueryParser.DISTINCT, 0); }
		public TerminalNode COALESCE() { return getToken(SQLQueryParser.COALESCE, 0); }
		public AggregateWindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateWindowedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterAggregateWindowedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitAggregateWindowedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAggregateWindowedFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateWindowedFunctionContext aggregateWindowedFunction() throws RecognitionException {
		AggregateWindowedFunctionContext _localctx = new AggregateWindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aggregateWindowedFunction);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				_la = _input.LA(1);
				if ( !(_la==AVG || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (MAX - 74)) | (1L << (MIN - 74)) | (1L << (SUM - 74)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(981);
				match(T__1);
				setState(982);
				functionArg();
				setState(983);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(COUNT);
				setState(986);
				match(T__1);
				setState(991);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(987);
					((AggregateWindowedFunctionContext)_localctx).starArg = match(T__13);
					}
					break;
				case T__3:
				case AVG:
				case COALESCE:
				case COUNT:
				case MAX:
				case MIN:
				case SUM:
				case ID:
				case DECIMAL_LITERAL:
					{
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COALESCE) | (1L << COUNT))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (MAX - 74)) | (1L << (MIN - 74)) | (1L << (SUM - 74)) | (1L << (ID - 74)) | (1L << (DECIMAL_LITERAL - 74)))) != 0)) {
						{
						setState(988);
						functionArg();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(993);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				match(COUNT);
				setState(995);
				match(T__1);
				setState(996);
				((AggregateWindowedFunctionContext)_localctx).aggregator = match(DISTINCT);
				setState(997);
				functionArgs();
				setState(998);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1000);
				match(COALESCE);
				setState(1001);
				match(T__1);
				setState(1002);
				functionArgs();
				setState(1003);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(SQLQueryParser.DECIMAL_LITERAL, 0); }
		public AggregateWindowedFunctionContext aggregateWindowedFunction() {
			return getRuleContext(AggregateWindowedFunctionContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionArg);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				column_name();
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(DECIMAL_LITERAL);
				}
				break;
			case AVG:
			case COALESCE:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				aggregateWindowedFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			functionArg();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1013);
				match(T__2);
				setState(1014);
				functionArg();
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLQueryParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case NUMERIC_LITERAL:
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(1020);
					_la = _input.LA(1);
					if ( !(_la==T__11 || _la==T__12) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1023);
				match(NUMERIC_LITERAL);
				}
				break;
			case T__13:
				{
				setState(1024);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLQueryParser.ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001r\u0406\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ae\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00c3\b\u000e\n\u000e\f\u000e\u00c6\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cc\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00d1\b\u000f\n\u000f\f\u000f\u00d4\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00da\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e1\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e6\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ea\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f7\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00fc\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0104"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u010f\b\u0011\n"+
		"\u0011\f\u0011\u0112\t\u0011\u0001\u0011\u0003\u0011\u0115\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011b\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0120\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0126\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u012b\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0133\b\u0013\u0001"+
		"\u0013\u0003\u0013\u0136\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u013a"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0140"+
		"\b\u0014\u0001\u0014\u0003\u0014\u0143\b\u0014\u0001\u0014\u0003\u0014"+
		"\u0146\b\u0014\u0003\u0014\u0148\b\u0014\u0001\u0014\u0003\u0014\u014b"+
		"\b\u0014\u0001\u0014\u0003\u0014\u014e\b\u0014\u0001\u0015\u0003\u0015"+
		"\u0151\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0164\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0168\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u016d\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0174"+
		"\b\u0015\n\u0015\f\u0015\u0177\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u017b\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0182\b\u0015\n\u0015\f\u0015\u0185\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u018d"+
		"\b\u0015\n\u0015\f\u0015\u0190\t\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0194\b\u0015\n\u0015\f\u0015\u0197\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u019c\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01a1\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a6"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01af\b\u0016\u0001\u0016\u0003\u0016\u01b2"+
		"\b\u0016\u0001\u0016\u0003\u0016\u01b5\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01ba\b\u0017\n\u0017\f\u0017\u01bd\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01c9\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01d4\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01d8\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01e8"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u01f0\b\u001c\n\u001c\f\u001c\u01f3\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01fa\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0200\b\u001d"+
		"\n\u001d\f\u001d\u0203\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u020a\b\u001e\u0001\u001e\u0003\u001e\u020d"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0213"+
		"\b\u001e\n\u001e\f\u001e\u0216\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0221\b\u001f\n\u001f\f\u001f\u0224\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u022c\b \u0001 \u0003 "+
		"\u022f\b \u0001!\u0001!\u0001!\u0003!\u0234\b!\u0001!\u0001!\u0003!\u0238"+
		"\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u024f\b%\u0001%\u0001%\u0004%\u0253\b%\u000b%\f%\u0254"+
		"\u0003%\u0257\b%\u0001&\u0001&\u0003&\u025b\b&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u0260\b\'\n\'\f\'\u0263\t\'\u0001\'\u0003\'\u0266\b\'\u0001("+
		"\u0001(\u0001(\u0003(\u026b\b(\u0001(\u0001(\u0003(\u026f\b(\u0001(\u0003"+
		"(\u0272\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0279\b(\u0001(\u0001"+
		"(\u0001(\u0001(\u0005(\u027f\b(\n(\f(\u0282\t(\u0001(\u0003(\u0285\b("+
		"\u0001(\u0001(\u0003(\u0289\b(\u0001(\u0003(\u028c\b(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0292\b(\u0001(\u0003(\u0295\b(\u0003(\u0297\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u02a3\b)\n)\f)\u02a6\t)\u0001)\u0001)\u0003)\u02aa\b)\u0005)\u02ac\b"+
		")\n)\f)\u02af\t)\u0001*\u0001*\u0003*\u02b3\b*\u0001*\u0001*\u0003*\u02b7"+
		"\b*\u0001*\u0001*\u0003*\u02bb\b*\u0001*\u0003*\u02be\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u02c6\b+\n+\f+\u02c9\t+\u0001+\u0001"+
		"+\u0003+\u02cd\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u02d9\b+\u0001+\u0001+\u0003+\u02dd\b+\u0005+\u02df"+
		"\b+\n+\f+\u02e2\t+\u0001+\u0003+\u02e5\b+\u0001+\u0001+\u0001+\u0001+"+
		"\u0001+\u0003+\u02ec\b+\u0001+\u0003+\u02ef\b+\u0003+\u02f1\b+\u0001,"+
		"\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u02fa\b-\u0001-\u0001"+
		"-\u0001-\u0003-\u02ff\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u030e\b-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u0315\b-\n-\f-\u0318\t-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0324\b-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u0332\b-\n-\f-\u0335\t-\u0001.\u0001.\u0003.\u0339\b."+
		"\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u0347\b.\n.\f.\u034a\t.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u0351\b/\n/\f/\u0354\t/\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00051\u035e\b1\n1\f1\u0361\t1\u00012\u00012\u0001"+
		"2\u00012\u00032\u0367\b2\u00012\u00012\u00012\u00012\u00012\u00032\u036e"+
		"\b2\u00013\u00013\u00013\u00033\u0373\b3\u00014\u00014\u00034\u0377\b"+
		"4\u00015\u00015\u00035\u037b\b5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u0383\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0393\b7\u00018\u0001"+
		"8\u00019\u00019\u0001:\u0001:\u0001:\u0003:\u039c\b:\u0001;\u0001;\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003=\u03a6\b=\u0001=\u0001=\u0001"+
		"=\u0003=\u03ab\b=\u0001=\u0001=\u0001=\u0003=\u03b0\b=\u0001=\u0003=\u03b3"+
		"\b=\u0001=\u0001=\u0003=\u03b7\b=\u0001=\u0003=\u03ba\b=\u0003=\u03bc"+
		"\b=\u0001>\u0001>\u0001>\u0003>\u03c1\b>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0005>\u03c8\b>\n>\f>\u03cb\t>\u0001>\u0001>\u0003>\u03cf\b>\u0001?"+
		"\u0001?\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u03de\bA\u0003A\u03e0\bA\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u03ee"+
		"\bA\u0001B\u0001B\u0001B\u0003B\u03f3\bB\u0001C\u0001C\u0001C\u0005C\u03f8"+
		"\bC\nC\fC\u03fb\tC\u0001D\u0003D\u03fe\bD\u0001D\u0001D\u0003D\u0402\b"+
		"D\u0001E\u0001E\u0001E\u0000\u0001ZF\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u0000"+
		"\u0007\u0002\u0000\u0019\u0019..\u0002\u0000--gg\u0005\u0000\u0012\u0012"+
		"44;;\\\\^^\u0001\u0000\f\u0010\u0003\u0000\f\r\u0011\u0011OO\u0003\u0000"+
		"\u001b\u001bJKaa\u0001\u0000\f\r\u047c\u0000\u008c\u0001\u0000\u0000\u0000"+
		"\u0002\u008e\u0001\u0000\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000"+
		"\u0006\u0092\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000\u0000\u0000\n"+
		"\u0096\u0001\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u009a"+
		"\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u009e"+
		"\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a2"+
		"\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00ad"+
		"\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00cd"+
		"\u0001\u0000\u0000\u0000 \u00d5\u0001\u0000\u0000\u0000\"\u00eb\u0001"+
		"\u0000\u0000\u0000$\u0116\u0001\u0000\u0000\u0000&\u0123\u0001\u0000\u0000"+
		"\u0000(\u0137\u0001\u0000\u0000\u0000*\u0150\u0001\u0000\u0000\u0000,"+
		"\u019d\u0001\u0000\u0000\u0000.\u01b6\u0001\u0000\u0000\u00000\u01be\u0001"+
		"\u0000\u0000\u00002\u01c1\u0001\u0000\u0000\u00004\u01c8\u0001\u0000\u0000"+
		"\u00006\u01d7\u0001\u0000\u0000\u00008\u01e9\u0001\u0000\u0000\u0000:"+
		"\u01f7\u0001\u0000\u0000\u0000<\u0207\u0001\u0000\u0000\u0000>\u021a\u0001"+
		"\u0000\u0000\u0000@\u0228\u0001\u0000\u0000\u0000B\u0230\u0001\u0000\u0000"+
		"\u0000D\u0239\u0001\u0000\u0000\u0000F\u023b\u0001\u0000\u0000\u0000H"+
		"\u023f\u0001\u0000\u0000\u0000J\u0242\u0001\u0000\u0000\u0000L\u025a\u0001"+
		"\u0000\u0000\u0000N\u0265\u0001\u0000\u0000\u0000P\u0296\u0001\u0000\u0000"+
		"\u0000R\u0298\u0001\u0000\u0000\u0000T\u02bd\u0001\u0000\u0000\u0000V"+
		"\u02bf\u0001\u0000\u0000\u0000X\u02f2\u0001\u0000\u0000\u0000Z\u0323\u0001"+
		"\u0000\u0000\u0000\\\u0336\u0001\u0000\u0000\u0000^\u034b\u0001\u0000"+
		"\u0000\u0000`\u0355\u0001\u0000\u0000\u0000b\u0358\u0001\u0000\u0000\u0000"+
		"d\u0362\u0001\u0000\u0000\u0000f\u0372\u0001\u0000\u0000\u0000h\u0374"+
		"\u0001\u0000\u0000\u0000j\u0378\u0001\u0000\u0000\u0000l\u0382\u0001\u0000"+
		"\u0000\u0000n\u0392\u0001\u0000\u0000\u0000p\u0394\u0001\u0000\u0000\u0000"+
		"r\u0396\u0001\u0000\u0000\u0000t\u039b\u0001\u0000\u0000\u0000v\u039d"+
		"\u0001\u0000\u0000\u0000x\u039f\u0001\u0000\u0000\u0000z\u03bb\u0001\u0000"+
		"\u0000\u0000|\u03c0\u0001\u0000\u0000\u0000~\u03d0\u0001\u0000\u0000\u0000"+
		"\u0080\u03d2\u0001\u0000\u0000\u0000\u0082\u03ed\u0001\u0000\u0000\u0000"+
		"\u0084\u03f2\u0001\u0000\u0000\u0000\u0086\u03f4\u0001\u0000\u0000\u0000"+
		"\u0088\u0401\u0001\u0000\u0000\u0000\u008a\u0403\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005l\u0000\u0000\u008d\u0001\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005l\u0000\u0000\u008f\u0003\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005l\u0000\u0000\u0091\u0005\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"l\u0000\u0000\u0093\u0007\u0001\u0000\u0000\u0000\u0094\u0095\u0005l\u0000"+
		"\u0000\u0095\t\u0001\u0000\u0000\u0000\u0096\u0097\u0005l\u0000\u0000"+
		"\u0097\u000b\u0001\u0000\u0000\u0000\u0098\u0099\u0005l\u0000\u0000\u0099"+
		"\r\u0001\u0000\u0000\u0000\u009a\u009b\u0005l\u0000\u0000\u009b\u000f"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u0011\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f\u0013\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1\u0015\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005l\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6"+
		"\u00ae\u0003(\u0014\u0000\u00a7\u00ae\u0003*\u0015\u0000\u00a8\u00ae\u0003"+
		"\"\u0011\u0000\u00a9\u00ae\u0003&\u0013\u0000\u00aa\u00ae\u0003\u001c"+
		"\u000e\u0000\u00ab\u00ae\u0003$\u0012\u0000\u00ac\u00ae\u0003,\u0016\u0000"+
		"\u00ad\u00a6\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u001b\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005(\u0000\u0000\u00b0\u00b4\u0005b\u0000\u0000\u00b1\u00b2"+
		"\u0005:\u0000\u0000\u00b2\u00b3\u0005O\u0000\u0000\u00b3\u00b5\u00052"+
		"\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b9\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u0012"+
		"\t\u0000\u00b7\u00b8\u0005\u0001\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00cb\u0003\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00c4\u0003\u001e\u000f"+
		"\u0000\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c3\u00034\u001a\u0000"+
		"\u00c0\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c3\u0003\u001e\u000f\u0000"+
		"\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000"+
		"\u00c8\u00cc\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0018\u0000\u0000"+
		"\u00ca\u00cc\u0003(\u0014\u0000\u00cb\u00bc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d2\u0003\u0002\u0001\u0000\u00ce\u00d1\u00036\u001b\u0000\u00cf\u00d1"+
		"\u0003 \u0010\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u001f\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00e9\u0003"+
		"\u0006\u0003\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00d9\u0003"+
		"\u0088D\u0000\u00d8\u00da\u0003\b\u0004\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0004\u0000\u0000\u00dc\u00ea\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0002\u0000\u0000\u00de\u00e0\u0003\u0088"+
		"D\u0000\u00df\u00e1\u0003\b\u0004\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u00e5\u0003\u0088D\u0000"+
		"\u00e4\u00e6\u0003\b\u0004\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0004\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d6\u0001\u0000\u0000\u0000\u00e9\u00dd\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00f6"+
		"\u0005g\u0000\u0000\u00ec\u00ed\u0005U\u0000\u0000\u00ed\u00f7\u0005^"+
		"\u0000\u0000\u00ee\u00ef\u0005U\u0000\u0000\u00ef\u00f7\u0005\u0012\u0000"+
		"\u0000\u00f0\u00f1\u0005U\u0000\u0000\u00f1\u00f7\u0005\\\u0000\u0000"+
		"\u00f2\u00f3\u0005U\u0000\u0000\u00f3\u00f7\u00054\u0000\u0000\u00f4\u00f5"+
		"\u0005U\u0000\u0000\u00f5\u00f7\u0005;\u0000\u0000\u00f6\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fb\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0003\u0012\t\u0000\u00f9\u00fa\u0005\u0001\u0000"+
		"\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u0103\u0003\u0000\u0000\u0000\u00fe\u00ff\u0005>\u0000\u0000"+
		"\u00ff\u0100\u0005\u001d\u0000\u0000\u0100\u0104\u0003\u0010\b\u0000\u0101"+
		"\u0102\u0005O\u0000\u0000\u0102\u0104\u0005>\u0000\u0000\u0103\u00fe\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"`\u0000\u0000\u0106\u0107\u0003\u0002\u0001\u0000\u0107\u0108\u0005\u0005"+
		"\u0000\u0000\u0108\u0110\u0003Z-\u0000\u0109\u010a\u0005\u0003\u0000\u0000"+
		"\u010a\u010b\u0003\u0002\u0001\u0000\u010b\u010c\u0005\u0005\u0000\u0000"+
		"\u010c\u010d\u0003Z-\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0109"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0003X,\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115#\u0001\u0000\u0000\u0000\u0116\u0117\u00050\u0000\u0000"+
		"\u0117\u011a\u0005b\u0000\u0000\u0118\u0119\u0005:\u0000\u0000\u0119\u011b"+
		"\u00052\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011f\u0001\u0000\u0000\u0000\u011c\u011d\u0003"+
		"\u0012\t\u0000\u011d\u011e\u0005\u0001\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0003\u0000"+
		"\u0000\u0000\u0122%\u0001\u0000\u0000\u0000\u0123\u0125\u0005-\u0000\u0000"+
		"\u0124\u0126\u00057\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u012a\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0003\u0012\t\u0000\u0128\u0129\u0005\u0001\u0000\u0000\u0129\u012b"+
		"\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0132"+
		"\u0003\u0000\u0000\u0000\u012d\u012e\u0005>\u0000\u0000\u012e\u012f\u0005"+
		"\u001d\u0000\u0000\u012f\u0133\u0003\u0010\b\u0000\u0130\u0131\u0005O"+
		"\u0000\u0000\u0131\u0133\u0005>\u0000\u0000\u0132\u012d\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0136\u0003X,\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\'\u0001\u0000\u0000\u0000\u0137\u0139\u0005_\u0000\u0000\u0138\u013a"+
		"\u0005/\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0147\u0003"+
		".\u0017\u0000\u013c\u013d\u00057\u0000\u0000\u013d\u013f\u0003N\'\u0000"+
		"\u013e\u0140\u0003X,\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0003^/\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u0003`0\u0000"+
		"\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u013c\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000"+
		"\u0149\u014b\u0003b1\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014e"+
		"\u0003d2\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e)\u0001\u0000\u0000\u0000\u014f\u0151\u0003\\.\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u0163\u0001\u0000\u0000\u0000\u0152\u0164\u0005A\u0000\u0000\u0153"+
		"\u0164\u0005\\\u0000\u0000\u0154\u0155\u0005A\u0000\u0000\u0155\u0156"+
		"\u0005U\u0000\u0000\u0156\u0164\u0005\\\u0000\u0000\u0157\u0158\u0005"+
		"A\u0000\u0000\u0158\u0159\u0005U\u0000\u0000\u0159\u0164\u0005^\u0000"+
		"\u0000\u015a\u015b\u0005A\u0000\u0000\u015b\u015c\u0005U\u0000\u0000\u015c"+
		"\u0164\u0005\u0012\u0000\u0000\u015d\u015e\u0005A\u0000\u0000\u015e\u015f"+
		"\u0005U\u0000\u0000\u015f\u0164\u00054\u0000\u0000\u0160\u0161\u0005A"+
		"\u0000\u0000\u0161\u0162\u0005U\u0000\u0000\u0162\u0164\u0005;\u0000\u0000"+
		"\u0163\u0152\u0001\u0000\u0000\u0000\u0163\u0153\u0001\u0000\u0000\u0000"+
		"\u0163\u0154\u0001\u0000\u0000\u0000\u0163\u0157\u0001\u0000\u0000\u0000"+
		"\u0163\u015a\u0001\u0000\u0000\u0000\u0163\u015d\u0001\u0000\u0000\u0000"+
		"\u0163\u0160\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0005B\u0000\u0000\u0166\u0168\u0005b\u0000\u0000\u0167\u0166"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016c"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0003\u0012\t\u0000\u016a\u016b\u0005"+
		"\u0001\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u0169\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u017a\u0003\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0002\u0000\u0000\u0170\u0175\u0003\u0002\u0001\u0000\u0171\u0172\u0005"+
		"\u0003\u0000\u0000\u0172\u0174\u0003\u0002\u0001\u0000\u0173\u0171\u0001"+
		"\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0005"+
		"\u0004\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u016f\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u019b\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005i\u0000\u0000\u017d\u017e\u0005\u0002"+
		"\u0000\u0000\u017e\u0183\u0003Z-\u0000\u017f\u0180\u0005\u0003\u0000\u0000"+
		"\u0180\u0182\u0003Z-\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0186\u0195\u0005\u0004\u0000\u0000\u0187\u0188"+
		"\u0005\u0003\u0000\u0000\u0188\u0189\u0005\u0002\u0000\u0000\u0189\u018e"+
		"\u0003Z-\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b\u018d\u0003Z"+
		"-\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005\u0004\u0000\u0000\u0192\u0194\u0001\u0000\u0000"+
		"\u0000\u0193\u0187\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u019c\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u019c\u0003(\u0014\u0000\u0199\u019a\u0005*\u0000\u0000\u019a"+
		"\u019c\u0005i\u0000\u0000\u019b\u017c\u0001\u0000\u0000\u0000\u019b\u0198"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c+\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0005\u0016\u0000\u0000\u019e\u01a0\u0005"+
		"b\u0000\u0000\u019f\u01a1\u0005T\u0000\u0000\u01a0\u019f\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0003\u0012\t\u0000\u01a3\u01a4\u0005\u0001\u0000\u0000"+
		"\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7\u01b1\u0003\u0014\n\u0000\u01a8\u01a9\u0005[\u0000\u0000\u01a9"+
		"\u01aa\u0005c\u0000\u0000\u01aa\u01b2\u0003\u0016\u000b\u0000\u01ab\u01b2"+
		"\u00032\u0019\u0000\u01ac\u01ae\u0005\u0014\u0000\u0000\u01ad\u01af\u0005"+
		"#\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003\u001e"+
		"\u000f\u0000\u01b1\u01a8\u0001\u0000\u0000\u0000\u01b1\u01ab\u0001\u0000"+
		"\u0000\u0000\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b5\u00051\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5-\u0001\u0000\u0000\u0000"+
		"\u01b6\u01bb\u0003z=\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8\u01ba"+
		"\u0003z=\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc/\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0005\u0014\u0000\u0000\u01bf\u01c0\u00034\u001a\u0000"+
		"\u01c01\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u0014\u0000\u0000\u01c2"+
		"\u01c3\u0005&\u0000\u0000\u01c3\u01c4\u0003\b\u0004\u0000\u01c4\u01c5"+
		"\u00034\u001a\u0000\u01c53\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005&"+
		"\u0000\u0000\u01c7\u01c9\u0003\b\u0004\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01d3\u0001\u0000\u0000"+
		"\u0000\u01ca\u01d4\u00038\u001c\u0000\u01cb\u01d4\u0003:\u001d\u0000\u01cc"+
		"\u01d4\u0003<\u001e\u0000\u01cd\u01ce\u0005 \u0000\u0000\u01ce\u01cf\u0005"+
		"\u0002\u0000\u0000\u01cf\u01d0\u0003Z-\u0000\u01d0\u01d1\u0005\u0004\u0000"+
		"\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d4\u0003>\u001f\u0000"+
		"\u01d3\u01ca\u0001\u0000\u0000\u0000\u01d3\u01cb\u0001\u0000\u0000\u0000"+
		"\u01d3\u01cc\u0001\u0000\u0000\u0000\u01d3\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d45\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0005&\u0000\u0000\u01d6\u01d8\u0003\b\u0004\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01e7"+
		"\u0001\u0000\u0000\u0000\u01d9\u01e8\u0003B!\u0000\u01da\u01e8\u0003D"+
		"\"\u0000\u01db\u01e8\u0003F#\u0000\u01dc\u01e8\u0003H$\u0000\u01dd\u01de"+
		"\u0005e\u0000\u0000\u01de\u01e8\u0003f3\u0000\u01df\u01e0\u0005 \u0000"+
		"\u0000\u01e0\u01e1\u0005\u0002\u0000\u0000\u01e1\u01e2\u0003Z-\u0000\u01e2"+
		"\u01e3\u0005\u0004\u0000\u0000\u01e3\u01e8\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e8\u0003J%\u0000\u01e5\u01e6\u0005\"\u0000\u0000\u01e6\u01e8\u0003"+
		"\u000e\u0007\u0000\u01e7\u01d9\u0001\u0000\u0000\u0000\u01e7\u01da\u0001"+
		"\u0000\u0000\u0000\u01e7\u01db\u0001\u0000\u0000\u0000\u01e7\u01dc\u0001"+
		"\u0000\u0000\u0000\u01e7\u01dd\u0001\u0000\u0000\u0000\u01e7\u01df\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e87\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005X\u0000"+
		"\u0000\u01ea\u01eb\u0005E\u0000\u0000\u01eb\u01ec\u0005\u0002\u0000\u0000"+
		"\u01ec\u01f1\u0003@ \u0000\u01ed\u01ee\u0005\u0003\u0000\u0000\u01ee\u01f0"+
		"\u0003@ \u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0005\u0004\u0000\u0000\u01f5\u01f6\u0003f3\u0000"+
		"\u01f69\u0001\u0000\u0000\u0000\u01f7\u01f9\u0005E\u0000\u0000\u01f8\u01fa"+
		"\u0003\b\u0004\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005"+
		"\u0002\u0000\u0000\u01fc\u0201\u0003@ \u0000\u01fd\u01fe\u0005\u0003\u0000"+
		"\u0000\u01fe\u0200\u0003@ \u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203"+
		"\u0201\u0001\u0000\u0000\u0000\u0204\u0205\u0005\u0004\u0000\u0000\u0205"+
		"\u0206\u0003f3\u0000\u0206;\u0001\u0000\u0000\u0000\u0207\u0209\u0005"+
		"e\u0000\u0000\u0208\u020a\u0005E\u0000\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0003\b\u0004\u0000\u020c\u020b\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0005\u0002\u0000\u0000\u020f\u0214\u0003@ \u0000\u0210\u0211"+
		"\u0005\u0003\u0000\u0000\u0211\u0213\u0003@ \u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000"+
		"\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u0004"+
		"\u0000\u0000\u0218\u0219\u0003f3\u0000\u0219=\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u00056\u0000\u0000\u021b\u021c\u0005E\u0000\u0000\u021c\u021d"+
		"\u0005\u0002\u0000\u0000\u021d\u0222\u0003\u0018\f\u0000\u021e\u021f\u0005"+
		"\u0003\u0000\u0000\u021f\u0221\u0003\u0018\f\u0000\u0220\u021e\u0001\u0000"+
		"\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000"+
		"\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0001\u0000"+
		"\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u0004"+
		"\u0000\u0000\u0226\u0227\u0003V+\u0000\u0227?\u0001\u0000\u0000\u0000"+
		"\u0228\u022b\u0003\u0002\u0001\u0000\u0229\u022a\u0005\"\u0000\u0000\u022a"+
		"\u022c\u0003\u000e\u0007\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d"+
		"\u022f\u0007\u0000\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0001\u0000\u0000\u0000\u022fA\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0005X\u0000\u0000\u0231\u0233\u0005E\u0000\u0000\u0232\u0234\u0007\u0000"+
		"\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0237\u0003f3\u0000"+
		"\u0236\u0238\u0005\u001a\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238C\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0003V+\u0000\u023aE\u0001\u0000\u0000\u0000\u023b\u023c\u0005"+
		"O\u0000\u0000\u023c\u023d\u0005P\u0000\u0000\u023d\u023e\u0003f3\u0000"+
		"\u023eG\u0001\u0000\u0000\u0000\u023f\u0240\u0005P\u0000\u0000\u0240\u0241"+
		"\u0003f3\u0000\u0241I\u0001\u0000\u0000\u0000\u0242\u024e\u0005*\u0000"+
		"\u0000\u0243\u024f\u0003L&\u0000\u0244\u0245\u0005\u0002\u0000\u0000\u0245"+
		"\u0246\u0003Z-\u0000\u0246\u0247\u0005\u0004\u0000\u0000\u0247\u024f\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0005M\u0000\u0000\u0249\u024a\u0005\u0002"+
		"\u0000\u0000\u024a\u024b\u0003Z-\u0000\u024b\u024c\u0005\u0004\u0000\u0000"+
		"\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024f\u0003\b\u0004\u0000\u024e"+
		"\u0243\u0001\u0000\u0000\u0000\u024e\u0244\u0001\u0000\u0000\u0000\u024e"+
		"\u0248\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024f"+
		"\u0256\u0001\u0000\u0000\u0000\u0250\u0252\u0005\u0006\u0000\u0000\u0251"+
		"\u0253\u0003\b\u0004\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0001\u0000\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0250"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257K\u0001"+
		"\u0000\u0000\u0000\u0258\u025b\u0003\u0088D\u0000\u0259\u025b\u0003t:"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u0259\u0001\u0000\u0000"+
		"\u0000\u025bM\u0001\u0000\u0000\u0000\u025c\u0261\u0003P(\u0000\u025d"+
		"\u025e\u0005\u0003\u0000\u0000\u025e\u0260\u0003P(\u0000\u025f\u025d\u0001"+
		"\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0266\u0001"+
		"\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0266\u0003"+
		"R)\u0000\u0265\u025c\u0001\u0000\u0000\u0000\u0265\u0264\u0001\u0000\u0000"+
		"\u0000\u0266O\u0001\u0000\u0000\u0000\u0267\u0268\u0003\u0012\t\u0000"+
		"\u0268\u0269\u0005\u0001\u0000\u0000\u0269\u026b\u0001\u0000\u0000\u0000"+
		"\u026a\u0267\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000"+
		"\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u0271\u0003\u0000\u0000\u0000"+
		"\u026d\u026f\u0005\u0018\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000"+
		"\u0270\u0272\u0003\u008aE\u0000\u0271\u026e\u0001\u0000\u0000\u0000\u0271"+
		"\u0272\u0001\u0000\u0000\u0000\u0272\u0278\u0001\u0000\u0000\u0000\u0273"+
		"\u0274\u0005>\u0000\u0000\u0274\u0275\u0005\u001d\u0000\u0000\u0275\u0279"+
		"\u0003\u0010\b\u0000\u0276\u0277\u0005O\u0000\u0000\u0277\u0279\u0005"+
		">\u0000\u0000\u0278\u0273\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u0297\u0001\u0000"+
		"\u0000\u0000\u027a\u0284\u0005\u0002\u0000\u0000\u027b\u0280\u0003P(\u0000"+
		"\u027c\u027d\u0005\u0003\u0000\u0000\u027d\u027f\u0003P(\u0000\u027e\u027c"+
		"\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e"+
		"\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0285"+
		"\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0285"+
		"\u0003R)\u0000\u0284\u027b\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u028b\u0005\u0004"+
		"\u0000\u0000\u0287\u0289\u0005\u0018\u0000\u0000\u0288\u0287\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000"+
		"\u0000\u0000\u028a\u028c\u0003\u008aE\u0000\u028b\u0288\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u0297\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0005\u0002\u0000\u0000\u028e\u028f\u0003(\u0014\u0000"+
		"\u028f\u0294\u0005\u0004\u0000\u0000\u0290\u0292\u0005\u0018\u0000\u0000"+
		"\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0295\u0003\u008aE\u0000\u0294"+
		"\u0291\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295"+
		"\u0297\u0001\u0000\u0000\u0000\u0296\u026a\u0001\u0000\u0000\u0000\u0296"+
		"\u027a\u0001\u0000\u0000\u0000\u0296\u028d\u0001\u0000\u0000\u0000\u0297"+
		"Q\u0001\u0000\u0000\u0000\u0298\u02ad\u0003P(\u0000\u0299\u029a\u0003"+
		"T*\u0000\u029a\u02a9\u0003P(\u0000\u029b\u029c\u0005S\u0000\u0000\u029c"+
		"\u02aa\u0003Z-\u0000\u029d\u029e\u0005h\u0000\u0000\u029e\u029f\u0005"+
		"\u0002\u0000\u0000\u029f\u02a4\u0003\u0002\u0001\u0000\u02a0\u02a1\u0005"+
		"\u0003\u0000\u0000\u02a1\u02a3\u0003\u0002\u0001\u0000\u02a2\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005"+
		"\u0004\u0000\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u029b\u0001"+
		"\u0000\u0000\u0000\u02a9\u029d\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u0299\u0001"+
		"\u0000\u0000\u0000\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02aeS\u0001\u0000"+
		"\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0\u02be\u0005\u0003"+
		"\u0000\u0000\u02b1\u02b3\u0005L\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02ba\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b6\u0005F\u0000\u0000\u02b5\u02b7\u0005W\u0000\u0000\u02b6"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7"+
		"\u02bb\u0001\u0000\u0000\u0000\u02b8\u02bb\u0005@\u0000\u0000\u02b9\u02bb"+
		"\u0005)\u0000\u0000\u02ba\u02b4\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001"+
		"\u0000\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02be\u0005"+
		"D\u0000\u0000\u02bd\u02b0\u0001\u0000\u0000\u0000\u02bd\u02b2\u0001\u0000"+
		"\u0000\u0000\u02beU\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005Z\u0000\u0000"+
		"\u02c0\u02cc\u0003\n\u0005\u0000\u02c1\u02c2\u0005\u0002\u0000\u0000\u02c2"+
		"\u02c7\u0003\f\u0006\u0000\u02c3\u02c4\u0005\u0003\u0000\u0000\u02c4\u02c6"+
		"\u0003\f\u0006\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c8\u02ca\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0005\u0004\u0000\u0000\u02cb\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cc\u02c1\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cd\u02e0\u0001\u0000\u0000\u0000\u02ce\u02cf\u0005"+
		"S\u0000\u0000\u02cf\u02d8\u0007\u0001\u0000\u0000\u02d0\u02d1\u0005`\u0000"+
		"\u0000\u02d1\u02d9\u0005P\u0000\u0000\u02d2\u02d3\u0005`\u0000\u0000\u02d3"+
		"\u02d9\u0005*\u0000\u0000\u02d4\u02d9\u0005\u001e\u0000\u0000\u02d5\u02d9"+
		"\u0005]\u0000\u0000\u02d6\u02d7\u0005N\u0000\u0000\u02d7\u02d9\u0005\u0013"+
		"\u0000\u0000\u02d8\u02d0\u0001\u0000\u0000\u0000\u02d8\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d4\u0001\u0000\u0000\u0000\u02d8\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9\u02dd\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0005I\u0000\u0000\u02db\u02dd\u0003\b\u0004"+
		"\u0000\u02dc\u02ce\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000"+
		"\u0000\u02dd\u02df\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000"+
		"\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02f0\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e5\u0005O\u0000\u0000"+
		"\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02eb\u0005+\u0000\u0000\u02e7"+
		"\u02e8\u0005?\u0000\u0000\u02e8\u02ec\u0005,\u0000\u0000\u02e9\u02ea\u0005"+
		"?\u0000\u0000\u02ea\u02ec\u0005<\u0000\u0000\u02eb\u02e7\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02ef\u00051\u0000\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f1\u0001\u0000\u0000\u0000\u02f0\u02e4\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1W\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0005j\u0000\u0000\u02f3\u02f4\u0003Z-\u0000\u02f4Y\u0001\u0000"+
		"\u0000\u0000\u02f5\u02fe\u0006-\uffff\uffff\u0000\u02f6\u02f7\u0003\u0012"+
		"\t\u0000\u02f7\u02f8\u0005\u0001\u0000\u0000\u02f8\u02fa\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f6\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0003\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0005\u0001\u0000\u0000\u02fd\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fe\u02f9\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000"+
		"\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0324\u0003\u0002\u0001"+
		"\u0000\u0301\u0324\u0003t:\u0000\u0302\u0303\u0003r9\u0000\u0303\u0304"+
		"\u0003Z-\u0005\u0304\u0324\u0001\u0000\u0000\u0000\u0305\u0306\u0003~"+
		"?\u0000\u0306\u0307\u0005\u001c\u0000\u0000\u0307\u0308\u0003t:\u0000"+
		"\u0308\u0309\u0005\u0017\u0000\u0000\u0309\u030a\u0003t:\u0000\u030a\u0324"+
		"\u0001\u0000\u0000\u0000\u030b\u030d\u0003~?\u0000\u030c\u030e\u0005O"+
		"\u0000\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000"+
		"\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0005=\u0000"+
		"\u0000\u0310\u0311\u0005\u0002\u0000\u0000\u0311\u0316\u0003t:\u0000\u0312"+
		"\u0313\u0005\u0003\u0000\u0000\u0313\u0315\u0003t:\u0000\u0314\u0312\u0001"+
		"\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000\u0000\u0316\u0314\u0001"+
		"\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001"+
		"\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0319\u031a\u0005"+
		"\u0004\u0000\u0000\u031a\u0324\u0001\u0000\u0000\u0000\u031b\u031c\u0005"+
		"\u0002\u0000\u0000\u031c\u031d\u0003(\u0014\u0000\u031d\u031e\u0005\u0004"+
		"\u0000\u0000\u031e\u0324\u0001\u0000\u0000\u0000\u031f\u0320\u0005\u0002"+
		"\u0000\u0000\u0320\u0321\u0003Z-\u0000\u0321\u0322\u0005\u0004\u0000\u0000"+
		"\u0322\u0324\u0001\u0000\u0000\u0000\u0323\u02f5\u0001\u0000\u0000\u0000"+
		"\u0323\u0301\u0001\u0000\u0000\u0000\u0323\u0302\u0001\u0000\u0000\u0000"+
		"\u0323\u0305\u0001\u0000\u0000\u0000\u0323\u030b\u0001\u0000\u0000\u0000"+
		"\u0323\u031b\u0001\u0000\u0000\u0000\u0323\u031f\u0001\u0000\u0000\u0000"+
		"\u0324\u0333\u0001\u0000\u0000\u0000\u0325\u0326\n\n\u0000\u0000\u0326"+
		"\u0327\u0003l6\u0000\u0327\u0328\u0003Z-\u000b\u0328\u0332\u0001\u0000"+
		"\u0000\u0000\u0329\u032a\n\u0007\u0000\u0000\u032a\u032b\u0003n7\u0000"+
		"\u032b\u032c\u0003Z-\b\u032c\u0332\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\n\u0006\u0000\u0000\u032e\u032f\u0003p8\u0000\u032f\u0330\u0003Z-\u0007"+
		"\u0330\u0332\u0001\u0000\u0000\u0000\u0331\u0325\u0001\u0000\u0000\u0000"+
		"\u0331\u0329\u0001\u0000\u0000\u0000\u0331\u032d\u0001\u0000\u0000\u0000"+
		"\u0332\u0335\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000"+
		"\u0333\u0334\u0001\u0000\u0000\u0000\u0334[\u0001\u0000\u0000\u0000\u0335"+
		"\u0333\u0001\u0000\u0000\u0000\u0336\u0338\u0005k\u0000\u0000\u0337\u0339"+
		"\u0005Y\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0338\u0339\u0001"+
		"\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033b\u0003"+
		"|>\u0000\u033b\u033c\u0005\u0018\u0000\u0000\u033c\u033d\u0005\u0002\u0000"+
		"\u0000\u033d\u033e\u0003(\u0014\u0000\u033e\u0348\u0005\u0004\u0000\u0000"+
		"\u033f\u0340\u0005\u0003\u0000\u0000\u0340\u0341\u0003|>\u0000\u0341\u0342"+
		"\u0005\u0018\u0000\u0000\u0342\u0343\u0005\u0002\u0000\u0000\u0343\u0344"+
		"\u0003(\u0014\u0000\u0344\u0345\u0005\u0004\u0000\u0000\u0345\u0347\u0001"+
		"\u0000\u0000\u0000\u0346\u033f\u0001\u0000\u0000\u0000\u0347\u034a\u0001"+
		"\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0348\u0349\u0001"+
		"\u0000\u0000\u0000\u0349]\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000"+
		"\u0000\u0000\u034b\u034c\u00058\u0000\u0000\u034c\u034d\u0005\u001d\u0000"+
		"\u0000\u034d\u0352\u0003j5\u0000\u034e\u034f\u0005\u0003\u0000\u0000\u034f"+
		"\u0351\u0003j5\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351\u0354\u0001"+
		"\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001"+
		"\u0000\u0000\u0000\u0353_\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000"+
		"\u0000\u0000\u0355\u0356\u00059\u0000\u0000\u0356\u0357\u0003Z-\u0000"+
		"\u0357a\u0001\u0000\u0000\u0000\u0358\u0359\u0005V\u0000\u0000\u0359\u035a"+
		"\u0005\u001d\u0000\u0000\u035a\u035f\u0003h4\u0000\u035b\u035c\u0005\u0003"+
		"\u0000\u0000\u035c\u035e\u0003h4\u0000\u035d\u035b\u0001\u0000\u0000\u0000"+
		"\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d\u0001\u0000\u0000\u0000"+
		"\u035f\u0360\u0001\u0000\u0000\u0000\u0360c\u0001\u0000\u0000\u0000\u0361"+
		"\u035f\u0001\u0000\u0000\u0000\u0362\u036d\u0005G\u0000\u0000\u0363\u0364"+
		"\u0003v;\u0000\u0364\u0365\u0005\u0003\u0000\u0000\u0365\u0367\u0001\u0000"+
		"\u0000\u0000\u0366\u0363\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u036e\u0003v;\u0000"+
		"\u0369\u036a\u0003v;\u0000\u036a\u036b\u0005R\u0000\u0000\u036b\u036c"+
		"\u0003v;\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d\u0366\u0001\u0000"+
		"\u0000\u0000\u036d\u0369\u0001\u0000\u0000\u0000\u036ee\u0001\u0000\u0000"+
		"\u0000\u036f\u0370\u0005S\u0000\u0000\u0370\u0371\u0005%\u0000\u0000\u0371"+
		"\u0373\u0007\u0002\u0000\u0000\u0372\u036f\u0001\u0000\u0000\u0000\u0372"+
		"\u0373\u0001\u0000\u0000\u0000\u0373g\u0001\u0000\u0000\u0000\u0374\u0376"+
		"\u0003~?\u0000\u0375\u0377\u0007\u0000\u0000\u0000\u0376\u0375\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377i\u0001\u0000\u0000"+
		"\u0000\u0378\u037a\u0003~?\u0000\u0379\u037b\u0007\u0000\u0000\u0000\u037a"+
		"\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b"+
		"k\u0001\u0000\u0000\u0000\u037c\u0383\u0005\u0017\u0000\u0000\u037d\u037e"+
		"\u0005\u0007\u0000\u0000\u037e\u0383\u0005\u0007\u0000\u0000\u037f\u0383"+
		"\u0005U\u0000\u0000\u0380\u0381\u0005\b\u0000\u0000\u0381\u0383\u0005"+
		"\b\u0000\u0000\u0382\u037c\u0001\u0000\u0000\u0000\u0382\u037d\u0001\u0000"+
		"\u0000\u0000\u0382\u037f\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000"+
		"\u0000\u0000\u0383m\u0001\u0000\u0000\u0000\u0384\u0393\u0005\u0005\u0000"+
		"\u0000\u0385\u0393\u0005\t\u0000\u0000\u0386\u0393\u0005\n\u0000\u0000"+
		"\u0387\u0388\u0005\n\u0000\u0000\u0388\u0393\u0005\u0005\u0000\u0000\u0389"+
		"\u038a\u0005\t\u0000\u0000\u038a\u0393\u0005\u0005\u0000\u0000\u038b\u038c"+
		"\u0005\n\u0000\u0000\u038c\u0393\u0005\t\u0000\u0000\u038d\u038e\u0005"+
		"\u000b\u0000\u0000\u038e\u0393\u0005\u0005\u0000\u0000\u038f\u0390\u0005"+
		"\n\u0000\u0000\u0390\u0391\u0005\u0005\u0000\u0000\u0391\u0393\u0005\t"+
		"\u0000\u0000\u0392\u0384\u0001\u0000\u0000\u0000\u0392\u0385\u0001\u0000"+
		"\u0000\u0000\u0392\u0386\u0001\u0000\u0000\u0000\u0392\u0387\u0001\u0000"+
		"\u0000\u0000\u0392\u0389\u0001\u0000\u0000\u0000\u0392\u038b\u0001\u0000"+
		"\u0000\u0000\u0392\u038d\u0001\u0000\u0000\u0000\u0392\u038f\u0001\u0000"+
		"\u0000\u0000\u0393o\u0001\u0000\u0000\u0000\u0394\u0395\u0007\u0003\u0000"+
		"\u0000\u0395q\u0001\u0000\u0000\u0000\u0396\u0397\u0007\u0004\u0000\u0000"+
		"\u0397s\u0001\u0000\u0000\u0000\u0398\u039c\u0003\u008aE\u0000\u0399\u039c"+
		"\u0003x<\u0000\u039a\u039c\u0003v;\u0000\u039b\u0398\u0001\u0000\u0000"+
		"\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039b\u039a\u0001\u0000\u0000"+
		"\u0000\u039cu\u0001\u0000\u0000\u0000\u039d\u039e\u0005p\u0000\u0000\u039e"+
		"w\u0001\u0000\u0000\u0000\u039f\u03a0\u0005m\u0000\u0000\u03a0y\u0001"+
		"\u0000\u0000\u0000\u03a1\u03bc\u0005\u000e\u0000\u0000\u03a2\u03a3\u0003"+
		"\u0012\t\u0000\u03a3\u03a4\u0005\u0001\u0000\u0000\u03a4\u03a6\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a8\u0003\u0000"+
		"\u0000\u0000\u03a8\u03a9\u0005\u0001\u0000\u0000\u03a9\u03ab\u0001\u0000"+
		"\u0000\u0000\u03aa\u03a5\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03bc\u0003\u0002"+
		"\u0001\u0000\u03ad\u03b2\u0003Z-\u0000\u03ae\u03b0\u0005\u0018\u0000\u0000"+
		"\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b3\u0003\u008aE\u0000\u03b2"+
		"\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3"+
		"\u03bc\u0001\u0000\u0000\u0000\u03b4\u03b9\u0003\u0080@\u0000\u03b5\u03b7"+
		"\u0005\u0018\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03ba"+
		"\u0003\u008aE\u0000\u03b9\u03b6\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bc\u0001\u0000\u0000\u0000\u03bb\u03a1\u0001"+
		"\u0000\u0000\u0000\u03bb\u03aa\u0001\u0000\u0000\u0000\u03bb\u03ad\u0001"+
		"\u0000\u0000\u0000\u03bb\u03b4\u0001\u0000\u0000\u0000\u03bc{\u0001\u0000"+
		"\u0000\u0000\u03bd\u03be\u0003\u0012\t\u0000\u03be\u03bf\u0005\u0001\u0000"+
		"\u0000\u03bf\u03c1\u0001\u0000\u0000\u0000\u03c0\u03bd\u0001\u0000\u0000"+
		"\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c2\u03ce\u0003\u0000\u0000\u0000\u03c3\u03c4\u0005\u0002\u0000"+
		"\u0000\u03c4\u03c9\u0003\u0002\u0001\u0000\u03c5\u03c6\u0005\u0003\u0000"+
		"\u0000\u03c6\u03c8\u0003\u0002\u0001\u0000\u03c7\u03c5\u0001\u0000\u0000"+
		"\u0000\u03c8\u03cb\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cc\u0001\u0000\u0000"+
		"\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005\u0004\u0000"+
		"\u0000\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03c3\u0001\u0000\u0000"+
		"\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf}\u0001\u0000\u0000\u0000"+
		"\u03d0\u03d1\u0003\u0002\u0001\u0000\u03d1\u007f\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d3\u0003\u0082A\u0000\u03d3\u0081\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d5\u0007\u0005\u0000\u0000\u03d5\u03d6\u0005\u0002\u0000\u0000\u03d6"+
		"\u03d7\u0003\u0084B\u0000\u03d7\u03d8\u0005\u0004\u0000\u0000\u03d8\u03ee"+
		"\u0001\u0000\u0000\u0000\u03d9\u03da\u0005\'\u0000\u0000\u03da\u03df\u0005"+
		"\u0002\u0000\u0000\u03db\u03e0\u0005\u000e\u0000\u0000\u03dc\u03de\u0003"+
		"\u0084B\u0000\u03dd\u03dc\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000"+
		"\u0000\u0000\u03de\u03e0\u0001\u0000\u0000\u0000\u03df\u03db\u0001\u0000"+
		"\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e1\u03ee\u0005\u0004\u0000\u0000\u03e2\u03e3\u0005\'\u0000"+
		"\u0000\u03e3\u03e4\u0005\u0002\u0000\u0000\u03e4\u03e5\u0005/\u0000\u0000"+
		"\u03e5\u03e6\u0003\u0086C\u0000\u03e6\u03e7\u0005\u0004\u0000\u0000\u03e7"+
		"\u03ee\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005!\u0000\u0000\u03e9\u03ea"+
		"\u0005\u0002\u0000\u0000\u03ea\u03eb\u0003\u0086C\u0000\u03eb\u03ec\u0005"+
		"\u0004\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03d4\u0001"+
		"\u0000\u0000\u0000\u03ed\u03d9\u0001\u0000\u0000\u0000\u03ed\u03e2\u0001"+
		"\u0000\u0000\u0000\u03ed\u03e8\u0001\u0000\u0000\u0000\u03ee\u0083\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f3\u0003\u0002\u0001\u0000\u03f0\u03f3\u0005"+
		"p\u0000\u0000\u03f1\u03f3\u0003\u0082A\u0000\u03f2\u03ef\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f3\u0085\u0001\u0000\u0000\u0000\u03f4\u03f9\u0003\u0084B\u0000"+
		"\u03f5\u03f6\u0005\u0003\u0000\u0000\u03f6\u03f8\u0003\u0084B\u0000\u03f7"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f8\u03fb\u0001\u0000\u0000\u0000\u03f9"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa"+
		"\u0087\u0001\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fc"+
		"\u03fe\u0007\u0006\u0000\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd"+
		"\u03fe\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff"+
		"\u0402\u0005q\u0000\u0000\u0400\u0402\u0005\u000e\u0000\u0000\u0401\u03fd"+
		"\u0001\u0000\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0402\u0089"+
		"\u0001\u0000\u0000\u0000\u0403\u0404\u0005l\u0000\u0000\u0404\u008b\u0001"+
		"\u0000\u0000\u0000\u0082\u00ad\u00b4\u00b9\u00c2\u00c4\u00cb\u00d0\u00d2"+
		"\u00d9\u00e0\u00e5\u00e9\u00f6\u00fb\u0103\u0110\u0114\u011a\u011f\u0125"+
		"\u012a\u0132\u0135\u0139\u013f\u0142\u0145\u0147\u014a\u014d\u0150\u0163"+
		"\u0167\u016c\u0175\u017a\u0183\u018e\u0195\u019b\u01a0\u01a5\u01ae\u01b1"+
		"\u01b4\u01bb\u01c8\u01d3\u01d7\u01e7\u01f1\u01f9\u0201\u0209\u020c\u0214"+
		"\u0222\u022b\u022e\u0233\u0237\u024e\u0254\u0256\u025a\u0261\u0265\u026a"+
		"\u026e\u0271\u0278\u0280\u0284\u0288\u028b\u0291\u0294\u0296\u02a4\u02a9"+
		"\u02ad\u02b2\u02b6\u02ba\u02bd\u02c7\u02cc\u02d8\u02dc\u02e0\u02e4\u02eb"+
		"\u02ee\u02f0\u02f9\u02fe\u030d\u0316\u0323\u0331\u0333\u0338\u0348\u0352"+
		"\u035f\u0366\u036d\u0372\u0376\u037a\u0382\u0392\u039b\u03a5\u03aa\u03af"+
		"\u03b2\u03b6\u03b9\u03bb\u03c0\u03c9\u03ce\u03dd\u03df\u03ed\u03f2\u03f9"+
		"\u03fd\u0401";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}