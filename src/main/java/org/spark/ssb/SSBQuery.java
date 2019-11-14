package org.spark.ssb

public class SSBQuery {
  private String url;
  private 
  protected static String driver = "org.apache.hive.jdbc.HiveDriver";

  public SSBQuery() {
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
