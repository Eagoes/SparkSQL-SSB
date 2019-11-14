drop table if exists customer;

create table customer
(
    c_customerkey int not null,
    c_name        varchar(50),
    c_address     varchar(50),
    c_city        varchar(50),
    c_nation      varchar(50),
    c_region      varchar(50),
    c_phone       varchar(50),
    c_mktsegment  varchar(50),
    primary key (c_customerkey)
);

drop table if exists part;

create table part
(
    p_partkey   int not null,
    p_name      varchar(50),
    p_mfgr      varchar(50),
    p_category  varchar(50),
    p_brand     varchar(50),
    p_colour    varchar(50),
    p_type      varchar(50),
    p_size      int,
    p_container varchar(50),
    primary key (p_partkey)
);

drop table if exists supplier;

create table supplier
(
    s_suppkey int,
    s_name    varchar(50),
    s_address varchar(50),
    s_city    varchar(50),
    s_nation  varchar(50),
    s_region  varchar(50),
    s_phone   varchar(50),
    primary key (s_suppkey)
);

drop table if exists date;

create table date
(
    d_datekey          int,
    d_date             varchar(50),
    d_dayofweek        varchar(50),
    d_month            varchar(50),
    d_year             int,
    d_yearmonthnum     int,
    d_yearmonth        varchar(50),
    d_daynuminweek     int,
    d_daynuminmonth    int,
    d_daynuminyear     int,
    d_monthnuminyear   int,
    d_weeknuminyear    int,
    d_sellingseason    varchar(50),
    d_lastdayinweekfl  int,
    d_lastdayInmonthfl int,
    d_holidayfl        int,
    d_weekdayfl        int,
    primary key (d_datekey)
);

drop table if exists lineorder;

create table lineorder
(
    lo_orderkey      int,
    lo_linenumber    int,
    lo_custkey       int,
    lo_partkey       int,
    lo_suppkey       int,
    lo_orderdatekey  int,
    lo_orderpriority varchar(50),
    lo_shippriority  varchar(50),
    lo_quantity      int,
    lo_extendedprice decimal(4, 2),
    lo_ordtotalprice decimal(4, 2),
    lo_discount      decimal(4, 2),
    lo_revenue       decimal(4, 2),
    lo_supplycost    decimal(4, 2),
    lo_tax           int,
    lo_commitdatekey int,
    lo_shipmode      varchar(50),
    primary key (lo_orderkey)
);