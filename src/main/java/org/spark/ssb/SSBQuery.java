package org.spark.ssb;

import org.spark.jdbc.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SSBQuery {
    protected String sql;
    protected HiveConnector connector;
    protected ResultSet resultSet;

    public SSBQuery() {
        connector = HiveConnector.getInstance();
    }

    public void ExecuteSQL() {
        assert (sql != null);
        resultSet = connector.executeSQL(sql);
    }

    public void getResult() {
        assert (resultSet != null);
        try {
            ResultSetPrinter.printResultSet(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
