package com.it521.hadoop.basic.shell;

/**
 * @author Ming
 * @描述 Hdfs常用命令及参数介绍
 */
public class Hdfs常用命令 {

    /**
     * @1 -ls
     */
    /*
     * 功能:显示目录信息
     *
     * 示例:it521 fs -ls hdfs://hadoop01:9000
     *
     * 备注:这些参数中,所有的hdfs路径都可以简写
     *
     * hdfs fs -ls 等同于上一条命令的效果
     */

    /**
     * @2 -mkdir
     */
    /*
     * 功能:在hdfs上创建目录
     *
     * 示例:hdfs fs -mkdir -p /aaa/bbb/ccc/ddd
     */

    /**
     * @3 -moveFromLocal
     */
    /*
     * 功能:从本地剪切粘贴到hdfs
     *
     * 示例:it521 -fs -moveFromLocal /home/it521/a.txt /aaa/bbb/ccc/ddd
     *
     * -moveToLocal
     *
     * 功能:从hdfs剪切粘贴到本地
     *
     * 示例:it521 fs -moveToLocal /aaa/bbb/ccc/ddd /home/it521/a.txt
     */

    /**
     * @4 -appendToFile
     */
    /*功能:追加一个文件到已经存在的文件末位
     *
     *示例:it521 fs -appendToFile ./hello.txt hdfs://hadoop01:9000/hello.txt
     *
     *可以简写: it521 fs -appendToFile ./hello.txt /hello.txt
     */

    /**
     * @5 -cat
     */
    /*
     *功能:显示文件内容
     *
     *示例: it521 fs -cat /hello.txt
     */

    /**
     * @6 -tail
     */
    /*功能: 显示一个文件的末尾
     *
     *示例:it521 -fs -tail /weblog/access_log.1
     */

    /**
     * @7 -text
     */
    /*
     * 功能:以字符形式打印一个文件的内容
     *
     * 示例:it521 fs -text /weblog/access_log.1
     */

    /**
     * -chgrp
     *
     * -chmod
     *
     * -chown
     */
    /*功能:linux文件系统中的用法一样,对文件所属权限
     *
     *示例 it521 fs -chmod 666 /hello.txt
     */

    /**
     * @9 copyFromLocal
     */
    /*功能:从本地文件系统中拷贝文件到hdfs路径去
     *
     *示例: it521 fs -copyFromLocal ./jdk.tat.gz /aaa/
     */

    /**
     * @10 copyToLocal
     */
    /*功能: 从hdfs拷贝到本地
     *
     *示例: it521 fs -copyToLocal /aaa/jdk.tar.gz
     */

    /**
     * @11 -cp
     */
    /*
     *功能: 从hdfs的一个路径拷贝hdfs的另一个路径
     *
     *示例: it521 fs -cp /aaa/jdk.tar.gz /bbb/jdk.tar.gz.2
     *
     */
    /**
     * @12 mv
     */
    /*
     *功能: 在hdfs目录中移动文件
     *
     *示例: it521 fs -mv /aaa/jdk.tar.gz /
     */
}
