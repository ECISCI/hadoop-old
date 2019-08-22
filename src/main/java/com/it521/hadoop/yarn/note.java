package com.it521.hadoop.yarn;

/**
 * @author Ming
 * @描述 yarn
 */
public class note {

    /**
     * @1.yarn的组成部分
     */
    /*
     * yarn共有 ResourceManager NodeManager JobHistoryServer Containers ApplicationMaster job task client组成
     *
     * 1.ResourceManager 一个cluster只有一个,负责资源调度,资源分配等工作
     *
     * 2.JobHistoryServer 负责查询Job运行进度及元数据管理
     *
     * 3.NodeManager 运行在datanode节点上,负责启动application和对资源的管理
     *
     * 4.Containers Container通过ResourceManager分配包括容器的CPU 内存等资源
     *
     * 5. ApplicationMaster 通俗来说ApplicationMaster相当于包工头,ResourceManager相当于经理,
     *
     * ResourceManager 首先将任务给ApplicationMaster,然后ApplicationMaster再将ResourceManager的指示
     *
     * 传达给各个NodeManager(相当于工人)进行干活,每个Application只有一个ApplicationMaster ,运行在NodeManager节点
     *
     * ApplicationMaster是由ResourceManager指派的
     *
     * 6.job 一个Mapper 一个Reducer 或一个进程的输入列表,job也可以叫做Application
     *
     * 7.task 一个具体做Mapper或Reducer的独立的工作单元,task运行在nodeManager的container中
     *
     * 8.client 一个提交给reduceManger的Application程序
     *
     * */

}
