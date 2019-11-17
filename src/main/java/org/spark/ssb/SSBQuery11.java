package org.spark.ssb;

public class SSBQuery11 extends SSBQuery {
    private static String rawSql = "select sum(lo_extendedprice*lo_discount) as revenue " +
            "from lineorder join date on lo_orderdatekey = d_datekey where d_year = 1993 " +
            " and lo_discount between 1 and 3 and lo_quantity < 25";

    public SSBQuery11() {
        super();
        sql = rawSql;
    }
}
