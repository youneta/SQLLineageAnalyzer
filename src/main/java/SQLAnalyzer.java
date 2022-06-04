import SQLQuery.SQLQueryLexer;
import SQLQuery.SQLQueryParser;
import SQLQuery.SQLQueryBaseListener;
import models.TableLineageModel;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

import org.neo4j.driver.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class SQLAnalyzer {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        ArrayList<String> stmts = new ArrayList<>();
        File file = new File("input.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            StringBuilder sb = new StringBuilder();
            while((s = br.readLine()) != null) {
                if(s.equals("")) {
                    stmts.add(sb.toString());
                    sb = new StringBuilder();
                }
                else sb.append(s + "\n");
            }
            if(!sb.isEmpty()) {
                stmts.add(sb.toString());
            }
            br.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        SQLVisitor myVisitor = new SQLVisitor();
        Neo4jPainter painter = new Neo4jPainter();
        if(!stmts.isEmpty()) {
            for(String SQLStmt : stmts) {
                SQLQueryLexer mySqlLexer = new SQLQueryLexer(CharStreams.fromString(SQLStmt.toUpperCase()));
                //词法符号的缓冲区,用于存储词法分析器生成的词法符号
                CommonTokenStream commonTokenStream = new CommonTokenStream(mySqlLexer);
                //新建一个语法分析器，处理词法符号缓冲区内容
                SQLQueryParser mySqlParser = new SQLQueryParser(commonTokenStream);
                ParseTree tree = mySqlParser.sql_statement();
                TableLineageModel resultTable = (TableLineageModel) myVisitor.visit(tree);
                if(resultTable!=null) painter.paint(resultTable);
//                System.out.println("hello");

            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("running time:" + (endTime - startTime) + "ms");
    }
}
