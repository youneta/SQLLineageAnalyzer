import models.TableLineageModel;
import org.neo4j.driver.*;

import java.util.HashSet;

public class Neo4jPainter {
    // 用户配置，Neo4j本地服务器的用户名与密码
    private final String Neo4jUserName = "neo4j";
    private final String Neo4jPassword =  "114514";


    private final String createTableCql = "create (table:TABLES {title:$title})";
    private final String createColumnCql = "create (column:COLUMNS {title:$title,table:$tableName})";
    private final String createTableColRelationCql = "match (a:COLUMNS),(b:TABLES) where %s" +
            " create (a)-[r:filed_from_table{notes:$notes}]->(b)";
    private final String createTableTableRelationCql = "match (a:TABLES),(b:TABLES) where a.title=$title1 and b.title=$title2" +
            " create (a)-[r:%s{notes:$notes}]->(b)";;
    public HashSet<String> tables;
    public HashSet<String> columns;

    private int select_count = 0;
    private int join_count = 0;

    public Neo4jPainter() {
        tables = new HashSet<>();
        columns = new HashSet<>();
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic(Neo4jUserName, Neo4jPassword));
        Session session = driver.session();
        session.run("match (n)-[r]-(m) delete n,r,m");
        session.run("match(n) delete n");
        session.close();
        driver.close();
    }

    public void paint(TableLineageModel tableLineage){
        try {
            Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic(Neo4jUserName, Neo4jPassword));
            Session session = driver.session();
            paintTable(tableLineage,session);
            session.close();
            driver.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void paintTable(TableLineageModel tableLineage, Session session) {
        String tableName = tableLineage.tableName;
        if (tableName.equals("select_result")) {
            tableName = "select_result_" + select_count;
            tableLineage.tableName = tableName;
            select_count ++;
        }
        else if(tableName.equals("join_result")) {
            tableName = "join_result_" + join_count;
            tableLineage.tableName = tableName;
            join_count ++;
        }
        if (!tables.contains(tableName)) {
            tables.add(tableName);
            session.run(createTableCql, Values.parameters("title", tableName));
        }
        for (String colName : tableLineage.columnNames) {
            if(!columns.contains(tableName + "." + colName)) {
                columns.add(tableName + "." + colName);
                session.run(createColumnCql, Values.parameters("title",colName,"tableName",tableName));
                String cql = String.format(createTableColRelationCql, "a.title='"+colName+"' and a.table='"+tableName+"' and b.title='"+tableName+"'");
                session.run(cql, Values.parameters("notes",""));
            }
        }

        for (TableLineageModel srcTable : tableLineage.sourceTables) {
            paintTable(srcTable,session);
            String cql = String.format(createTableTableRelationCql, srcTable.process);
            session.run(cql, Values.parameters("title1", srcTable.tableName, "title2", tableName, "notes",""));
        }

    }
}
