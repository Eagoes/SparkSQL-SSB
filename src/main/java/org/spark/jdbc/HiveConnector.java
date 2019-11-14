import java.sql.Statement;

public class HiveConnector {
  private static String driver_ = "org.apache.hive.jdbc.HiveDriver";
  private static String ip_;
  private static int port_;
  private static String database_;
  private static String url_;
  private static String user_;
  private static String passwd_;
  private static Connection conn_;
  private static Statement stmt_;
  private static HiveConnector instance_;

  private HiveConnector(String ip, int port, String database, String user, String passwd) {
    ip_ = ip;
    port_ = port;
    database_ = database;
    url = "jdbc:hive2://" + ip + ":" + port + "/" + database;
    user_ = user;
    passwd_ = passwd;

    try {
      Class.forName(driver);
      conn_ = DriverManager.getConnection(url_, user_, passwd_);
      if (!conn.isClosed())
        System.out.println("Succeeded connecting to the Database!");
      stmt_ = conn.createStatement();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static synchronized HiveConnector getInstance() {
    if (instance_ == null) {
      instance_ = new HiveConnector("10.77.50.78", 10013, "ssb", "", "");
    }
    return instance_;
  }
}