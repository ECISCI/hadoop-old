package com.it521.hadoop.hdfs.note;

/**
 * @author Ming
 * @描述 namenode管理机制
 * @解释 一条元数据 15Byte
 */
public class note02 {

    /**
     * @1.namenode读数据的流程
     */
    /*  1.请求namenode下载文件(元数据,记录了存储的历史数据)
     *
     *  2. 返回目标文件的元数据
     */

    /**
     * @2.checkpoint 触发条件
     *
     * 定时 edits的记录数量
     */
    /*
     * 1.secondNameNode 请求是否需要checkpoint
     *
     * 2.secondNameNode 请求checkpoint
     *
     * 3.edits.inprogress  namenode滚动当前正在写的edits
     *
     * */
}
