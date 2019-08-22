package com.it521.hive;

/**
 * @author Ming
 * @描述 Hive Sql语句
 */
public class Hql {

    /**
     * @1 ###清除表中内容
     *
     * truncate table test;
     */

    /**
     * @1 ###删除表
     *
     * drop table test;
     */
    /**
     * @2创建表 并按指定格式切割数据
     */
    /*
     * create table hive01(id int,name string)
     *
     * row format delimited
     *
     * fields terminated by ',';
     *
     */

    /**
     * @3根据条件查找
     */
    /*
     * select id,name from hive01 where id>2;
     */

    /**
     * @4 通过Sql去执行mapreduce
     */
    /*
     * select id,name from hive01 order by name;
     */

}
