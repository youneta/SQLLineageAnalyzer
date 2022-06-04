package models;

import java.util.ArrayList;

public class TableLineageModel {
    public String tableName;
    public ArrayList<String> columnNames;
    public String process;
    public ArrayList<TableLineageModel> sourceTables;
    public String uid;
    public String realTableName;

    public TableLineageModel() {
        tableName = "";
        uid = "";
        realTableName = "";
        columnNames = new ArrayList<>();
        process = "related";
        sourceTables = new ArrayList<>();
    }
}
