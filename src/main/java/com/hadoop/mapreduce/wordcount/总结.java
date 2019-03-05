package com.hadoop.mapreduce.wordcount;

public class 总结 {
    /**
     * @1编程规范
     */
    /*1.用户编写的程序分成三个部分,Mapper,Reducer,Driver(提交运行mr程序的客户端)
     *
     *2.Mapper的输入数据是KV对的形式(KV的类型可自定义)
     *
     *3.Mapper的输出数据是KV对的形式(KV的类型可自定义)
     *
     *4.Mapper中的业务逻辑写在map()方法中
     *
     *5.map()方法(map task进程)对每一个（K,V）调用一次
     *
     *6.Reducer的输入数据类逆行对应Mapper的输出数据类型,也是KV
     *
     *7.Reducer的业务逻辑写在Reduce()方法中
     *
     *8.ReduceTask进程对每一组相同K的<K,V>组调用一次reduce()方法
     *
     *9.用户的Mapper和Reducer都要继承各自的父类
     *
     *10.整个程序需要一个Driver来进行提交,提交的事一个描述了各种必要信息的job对象
     */
}
