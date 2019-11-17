import org.spark.ssb.SSBQuery;
import org.spark.ssb.SSBQuery11;

import java.sql.*;

public class QueryTest {
    public static void main(String[] args) {
//        SSBQuery query11 = new SSBQuery11();
//        query11.ExecuteSQL();
//        query11.getResult();
        String url = "jdbc:hive2://10.77.50.78:10013/ssb";
        String sql = "select sum(lo_extendedprice*lo_discount) as revenue " +
                "from lineorder join `date` on lo_orderdatekey = d_datekey and d_year = 1993 " +
                " and lo_discount between 1 and 3 and lo_quantity < 25";
        System.out.println(sql);

        try {
            Class.forName("org.apache.hive.jdbc.HiveDriver");
            Connection conn = DriverManager.getConnection(url, "root", "Root_2019");
            if (!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
