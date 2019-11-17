package org.spark.ssb;

public class SSBQuery21 extends SSBQuery {
    private static String rawSql = "select sum(lo_revenue), d_year, p_brand" +
            "from lineorder" +
            "join date" +
            "  on lo_orderdatekey = d_datekey" +
            "join part" +
            "  on lo_partkey = p_partkey" +
            "join supplier" +
            "  on lo_suppkey = s_suppkey" +
            "where " +
            "p_category = 'MFGR#12'" +
            "and s_region = 'AMERICA'" +
            "group by d_year, p_brand" +
            "order by d_year, p_brand";

    public SSBQuery21() {
        super();
        sql = rawSql;
    }
}
