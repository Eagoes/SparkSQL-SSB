package org.spark.jdbc;

import java.sql.*;

public class HiveConnector {
  private static String driver_ = "org.apache.hive.jdbc.HiveDriver";
  private static Connection conn_;
  private static Statement stmt_;
  private static HiveConnector instance_;

  private HiveConnector(String ip, int port, String database, String user, String passwd) {
      String url = "jdbc:hive2://" + ip + ":" + port + "/" + database;

    try {
        Class.forName(driver_);
        conn_ = DriverManager.getConnection(url, user, passwd);
        if (!conn_.isClosed())
        System.out.println("Succeeded connecting to the Database!");
        stmt_ = conn_.createStatement();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

    public void finalize() {
        try {
            if (!conn_.isClosed()) conn_.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  public static synchronized HiveConnector getInstance() {
    if (instance_ == null) {
        instance_ = new HiveConnector("10.77.50.78", 10013, "ssb", "root", "Root_2019");
    }
    return instance_;
  }

    public synchronized ResultSet executeSQL(String sql) {
        try {
            System.out.println("Exexute SQL: \n" + sql);
            return stmt_.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}