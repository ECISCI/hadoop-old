package com.hadoop.mapreduce.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author Ming
 * @描述 相当于yarn集群的客户端
 * 需要在此封装我们的mr程序的相关运行参数,指定jar包,最后提交给yarn
 */
public class WordCountDriver {

    public static void main(String[] args) {


        Configuration conf = new Configuration();

        // 放在上Linux平台不需要配置,因为在搭建环境的时候已经配置好了
        // conf.set("mapreduce.framework.name","yarn");
        // conf.set("yarn.resourcemanager.hostname","hadoop01");

        try {
            Job job = Job.getInstance(conf);

            // 指定本程序的Jar所在的本地路径
            job.setJarByClass(WordCountMapper.class);

            // 指定本业务Job要使用的mapper业务类
            job.setMapperClass(WordCountMapper.class);
            // 指定本业务Job要使用的Reducer业务类
            job.setReducerClass(WordCountReducer.class);

            // 指定mapper输出的数据kv类型
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(IntWritable.class);


            // 指定最终输出的数据的kv类型
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(IntWritable.class);


            // 指定job的输入原始文件所在目录
            FileInputFormat.setInputPaths(job, new Path(args[0]));
            // 指定job的输出结果所在目录
            FileOutputFormat.setOutputPath(job, new Path(args[1]));


            // 将job配置中的相关参数,以及job所用的Java类所在的Jar包提交给运行
            // job.submit();

            // 把集群反馈的信息打印,看看集群运行成功还是失败
            boolean b = job.waitForCompletion(true);

            System.exit(b ? 0 : 1);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
