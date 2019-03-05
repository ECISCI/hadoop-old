package com.hadoop.mapreduce.flowstatistics;

/**
 * @author Miing
 * @需求 统计每一个用户(手机号)所有海飞的总上行流量,下行流量,总流量
 * @设计 map方法,切分字段,抽取手机号,上行流量,下行流量 context.write(k,v)
 *
 * k手机号 v(上行流量下行流量) 将v封装成一个对象
 */
public class 总结 {
}
