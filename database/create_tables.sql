CREATE DATABASE IF NOT EXISTS `ssb`;

drop table if exists `ssb.customer`;

drop table if exists `ssb.part`;

drop table if exists `ssb.supplier`;

drop table if exists `ssb.date`;

drop table if exists `ssb.lineorder`;

CREATE TABLE IF NOT EXISTS `ssb.customer`(
  `c_customerkey` INT,
  `c_name` STRING,
  `c_address` STRING,
  `c_city` STRING,
  `c_nation` STRING,
  `c_region` STRING,
  `c_phone` STRING,
  `c_mktsegment` STRING
) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|';

CREATE TABLE `ssb.part`(
  `p_partkey` INT,
  `p_name` STRING,
  `p_mfgr` STRING,
  `p_category` STRING,
  `p_brand` STRING,
  `p_colour` STRING,
  `p_type` STRING,
  `p_size` INT,
  `p_container` STRING
) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|';

CREATE TABLE `ssb.supplier`(
  `s_suppkey` INT,
  `s_name` STRING,
  `s_address` STRING,
  `s_city` STRING,
  `s_nation` STRING,
  `s_region` STRING,
  `s_phone` STRING
) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|';

CREATE TABLE `ssb.date`(
  `d_datekey` INT,
  `d_date` STRING,
  `d_dayofweek` STRING,
  `d_month` STRING,
  `d_year` INT,
  `d_yearmonthnum` INT,
  `d_yearmonth` STRING,
  `d_daynuminweek` INT,
  `d_daynuminmonth` INT,
  `d_daynuminyear` INT,
  `d_monthnuminyear` INT,
  `d_weeknuminyear` INT,
  `d_sellingseason` STRING,
  `d_lastdayinweekfl` INT,
  `d_lastdayInmonthfl` INT,
  `d_holidayfl` INT,
  `d_weekdayfl` INT
) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|';

CREATE TABLE `ssb.lineorder`(
  `lo_orderkey` INT,
  `lo_linenumber` INT,
  `lo_custkey` INT,
  `lo_partkey` INT,
  `lo_suppkey` INT,
  `lo_orderdatekey` INT,
  `lo_orderpriority` STRING,
  `lo_shippriority` STRING,
  `lo_quantity` INT,
  `lo_extendedprice` DOUBLE,
  `lo_ordtotalprice` DOUBLE,
  `lo_discount` DOUBLE,
  `lo_revenue` DOUBLE,
  `lo_supplycost` DOUBLE,
  `lo_tax` INT,
  `lo_commitdatekey` INT,
  `lo_shipmode` STRING
) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|';