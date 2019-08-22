package com.it521.hive;

/**
 * @author Ming
 * @描述 Hive基本的的概念
 */
public class aibi_basic {

    /**
     * @1Hive简介
     */
    /*
     * Hive是基于Hadoop的一个数据仓库工作,可以结构化的数据文件映射为一张数据库表,
     *
     * 并提供类似SQL查询功能
     */

    /**
     * @2为什么使用Hive
     */
    /*
     * 直接使用hadoop所面临的问题
     *
     * mr实现复杂查询逻辑开发难度太大
     *
     * 为什么使用Hive 操作接口采用类似SQL语法,
     *
     * 提供快速开发的能力,避免了去写mr,扩展功能很方便
     *
     * */

    /**
     * @3Hive的特点
     */
    /*
     * 1.可扩展性
     *
     * Hive可以自由的扩展集群的规模,一般情况下不需要重启服务
     *
     * 2.延展性
     *
     * Hive支持用户自定义函数,用户可以根据自己的需求来实现自己的函数
     *
     * 3.容错
     *
     * 良好的容错性,节点出现问题SQL仍可完成执行
     * */

    /**
     * @4基本组成
     */
    /*
     * 用户接口:包括 CLI,JDBC/ODBC,WebGUI
     *
     * 元数据存储:通常是存储在关系数据库如 mysql,derby中
     *
     * 解释器,编译器,优化器,执行器
     *
     */

    /**
     * @5各组件的基本功能
     */
    /* 用户接口主要有三个:CLI JDBC ODBC 和WEBGUI
     *
     * CLI 是shell命令行
     *
     * JDBC/ODBC是Hive的Java实现
     *
     * 与传统数据库JDBC类似 WebGUI是通过浏览器访问HIVE
     *
     * 元数据存储:Hive将元数据存储在数据库中,Hive中的元数据包括表的名字
     *
     * 表列和分区及其属性,表的属性(是否为外部表等),表的数据所在的目录等
     *
     * 解释器,编译器,优化器,完成HQL查询语句从词法分析,语法分析,编译,
     *
     * 优化以及查询计划的生成,生成的查询计划存储在HDFS中,并在随后有mr
     *
     * 调用执行
     */

    /**
     * @6Hive与Hadoop的关系
     */
    /* Hive利用HDFS的存储数据,利用MapReduce查询数据
     *
     * 发出SQL-->Hive处理转换成mr--> 提交任务到Hadoop-->mr运行
     */

    /**
     * @7Hive与传统数据库对比
     */
    /* 1. Hive
     *
     * 查询语句HQL
     *
     * 数据存储 Hdfs
     *
     * 执行 mapreduce
     *
     * 执行延迟 高
     *
     * 处理数据规模 大
     *
     * 索引 0.8版本后加入位图索引
     *
     * 2.RDBMS
     *
     * 查询语句SQL
     *
     * 数据存储 Raw Device or Local FS
     *
     * 执行 excutor
     *
     * 执行延迟 低
     *
     * 处理数据规模 小
     *
     * 索引 有复杂的索引
     *
     * 总结:Hive具有Sql数据库的外表,但应用场景完全不同,hive只适合用来做批量数据统计分析
     */

    /**
     * @8Hive的数据存储
     */
    /* 1.Hive中所有的数据都存在HDFS中,没有专门的数据存储格式(可支持 Text,SequenceFile,ParquetFile,RCFILE等)
     *
     * 2.只需要创建表的时候告诉Hive数据中列分隔符和行分隔符,Hive就可以解析数据
     *
     * 3.Hive中包含以下的数据模型:DB,Table,Exernal Table,Partition,Bucket
     *
     * db：在         ive.metastore.warehouse.dir}目录下一个文件夹
     *
     * table：在hdfs中表现所属db目录下一个文件夹
     *
     * external table：与table类似，不过其数据存放位置可以在任意指定路径
     *
     * partition：在hdfs中表现为table目录下的子目录
     *
     * bucket：在hdfs中表现为同一个表目录下根据hash散列之后的多个文件
     */

}