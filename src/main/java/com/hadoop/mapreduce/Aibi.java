package com.hadoop.mapreduce;

/**
 * @author Ming
 * @描述 MapReduce
 */
public class Aibi {
    /**
     * @1MapReduce原理篇
     */
    /* MapReduce是一个分布式运算程序的编程框架,是用户开发,基于hadoop的数据分析应用
     * 的核心框架
     *
     * MapReduce核心功能是将用户编写的业务逻辑代码和自带默认组件整合成一个完整的分布式运算程序,
     *
     * 并发运行在一个hadoop集群上
     */

    /**
     * @2为什么要MapReduce
     */
    /* 1.海量数据在单机上处理因为硬件资源限制,无法胜任
     *
     * 2.而一旦将单机版程序扩展到集群来分布式运行,将极大增加程序的复杂程度和开发难度
     *
     * 3.引入mapreduce框架后,开发人员可以将绝大部分工作几种在业务逻辑的开发上
     *
     * 而将分布式计算中的复杂性交由框架来处理
     */

    /**
     * @3MapReduce分布式运算的两个阶段
     */
    /*
     * 1.分布式运算程序往往需要分成至少两个阶段
     *
     * 2.第一个阶段的task并发实例各司其职,各自为政互不相干,完全并行（map task）
     *
     * 3.第二阶段的task并发实例互不相干,但是它们的数据依赖于(reduce task)
     *
     * 上一个阶段的所有task并发实例的输出,
     *
     * 4.MapReduce编程模型只能包含一个map阶段和一个reduce阶段,如果用户的业务逻辑非常复杂
     *
     * 那就只能来多个mapreduce程序,串行运行
     */
    /*1.读数据
     *
     *2.按行处理
     *
     *3.按空格切分行内单词
     *
     *4.HashMap(单词,value+1)
     *
     *5.将HashMap按照首字母范围分成3个hashMap
     *
     *6.将3个HashMap分别传送给3个 reduce task
     */

    /**
     * @4若干细节问题
     */
    /*1.你的map task如何进行任务分配
     *
     *2.reduce task如何分配要处理的任务
     *
     *3.map task和reduce task之间如何衔接
     *
     *4.如果map task 运行失败,如何处理？
     *
     *5.map task如果都要自己负责输出数据的分区,很麻烦
     */
    /**
     * @6MapReduce主管
     */
    /* mr application master
     */

}
