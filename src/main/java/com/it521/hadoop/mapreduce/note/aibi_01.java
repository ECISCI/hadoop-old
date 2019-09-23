package com.it521.hadoop.mapreduce.note;

/**
 * @author Ming
 * @描述 MapReduce框架介绍
 */
public class aibi_01 {


    /**
     * @1.框架介绍
     */
    /*
     * 1. MapReduce模型主要包含 mapper和Reducer两个抽象类
     *
     * 2. Mapper主要负责对数据的分析处理 最终转化为key-value的数据对
     *
     * 3. Reducer类主要获取数据对,然后处理统计得到结果
     *
     * 4. MapReduce实现了存储的均衡但没有实现计算的均衡
     */
    /**
     * @2.MapReduce 主要包括 JobClient,JobTracker,TaskTracker,HDFS 四个独立的部分
     */

    /**
     * @2.1JobClient
     */
    /* 配置参数Configuration,并打包成Jar文件存储在HDFS上,将文件路径提交给JobTracker的Master服务
     *
     * 然后由Master创建每个task将它们分发到各个TaskTracker服务中去执行
     */

    /**
     * @2.2JobTracker
     */
    /*
     * 这是一个Master服务,程序启动后 JobTracker负责资源监控和作业调度
     *
     * JobTracker监控所有的TaskTracker和job的健康状况 一旦发生失败,即将之转移到其他节点上
     */

    /**
     * @2.3TaskTracker
     */
    /*
     * TaskTracker是运行在多个节点上的salver服务
     *
     * TaskTracker主动与JobTacker通信,接受作业,并负责直接执行每个人物
     *
     * TaskTracker使用slot等量划分本节点上的资源量
     */


    /**
     * @2.3.1slot
     */
    /*
     * slot代表计算资源(CPU 内存等)
     *
     * 一个Task获取到一个slot后才有机会运行,
     *
     * 而Hadoop调度器的作用就是将各个TaskTracker上空闲slot分配给Task使用
     *
     * slot 分为 Map slot 和Reduce slot两种分别供Map Task 和Reduce Task使用
     */
    /**
     * @2.3.2Task
     */
    /*
     * Task分为Map Task和Reduce Task两种,均由TaskTracker启动
     *
     * HDFS以block块存储数据,MapReduce处理的最小数据单位为split
     *
     * Split的划分由用户自由设置
     */
}
