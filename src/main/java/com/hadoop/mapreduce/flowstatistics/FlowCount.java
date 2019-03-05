package com.hadoop.mapreduce.flowstatistics;

import com.hadoop.mapreduce.wordcount.WordCountMapper;
import com.hadoop.mapreduce.wordcount.WordCountReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
/**
 * @author Miing
 * @需求 统计每一个用户(手机号)所有海飞的总上行流量,下行流量,总流量
 * @设计 map方法,切分字段,抽取手机号,上行流量,下行流量 context.write(k,v)
 *
 * k手机号 v(上行流量下行流量) 将v封装成一个对象
 */
public class FlowCount {

    /**
     * 静态内部类 mapper方法
     */
    static class FlowCountMapper extends Mapper<LongWritable, Text, Text, FlowBean> {

        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

            // 将一行内容转成String
            String line = value.toString();
            // 切分字段
            String[] fileds = line.split("\t");

            String phoneNumber = fileds[0];

            long uFlow = Long.parseLong(fileds[fileds.length - 3]);
            long dFlow = Long.parseLong(fileds[fileds.length - 2]);

            context.write(new Text(phoneNumber), new FlowBean(uFlow, dFlow));
        }
    }

    /**
     * 静态内部类 reducer方法
     */
    static class FlowCountReducer extends Reducer<Text, FlowBean, Text, FlowBean> {


        @Override
        protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {

            long sum_uFlow = 0;
            long sum_dFlow = 0;

            // 遍历所有的Bean,将其中的上行流量,下行流量分别累加

            for (FlowBean bean : values) {

                sum_uFlow += bean.getuFlow();
                sum_dFlow += bean.getdFlow();
            }

            FlowBean bean = new FlowBean(sum_uFlow, sum_dFlow);

            context.write(key, bean);


        }
    }


    public static void main(String[] args) {


        Configuration conf = new Configuration();

        // 放在上Linux平台不需要配置,因为在搭建环境的时候已经配置好了
        // conf.set("mapreduce.framework.name","yarn");
        // conf.set("yarn.resourcemanager.hostname","hadoop01");

        try {
            Job job = Job.getInstance(conf);

            // 指定本程序的Jar所在的本地路径
            job.setJarByClass(FlowCount.class);

            // 指定本业务Job要使用的mapper业务类
            job.setMapperClass(FlowCountMapper.class);
            // 指定本业务Job要使用的Reducer业务类
            job.setReducerClass(FlowCountReducer.class);

            // 指定mapper输出的数据kv类型
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(FlowBean.class);


            // 指定最终输出的数据的kv类型
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(FlowBean.class);


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
