package models;

import java.util.ArrayList;

public class ColumnLineageModel {
    public String columnName;
    public String tableName; //来源表格名
    public ArrayList<ColumnLineageModel> srcCol;
    public String process;
    public ColumnLineageModel() {
        columnName = "";
        tableName = "";
        process = "";
        srcCol = new ArrayList<>();
    }
}
