package com.it521.hadoop.mapreduce.wordcount;

/**
 * @author Ming
 * @描述 这个类是为了测试打成的jar是否好用
 * @使用方法 TestJar设置为主类, 将打好的Jar包放在指定磁盘下, 打开命令行（cmd）执行命令 java -jar d:\Hadoop.jar
 * 控制台输出hello,证明打包成功
 * @注意！！！ 这只是一个简单的测试, 在Linux环境下执行mapreduce程序java -jar是不可用的需要使用hadoop jar命令
 */
public class TestJar {

    public static void main(String[] args) {

        System.out.println("hello");
    }
}
