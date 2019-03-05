package com.hadoop.mapreduce.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author Ming
 * <p>
 * @实现 Mapper泛型 --> kEYIN  VALUEIN   KEYOUT   VALUEOUT
 * <p>
 * @参数 KEYIN 默认情况下,是mr框架所读到的一行文本的起始偏移量 --> Long类型
 * 但是在mr中有自己更精简的序列化接口,所以不直接用Long,而是用LongWritable
 * <p>
 * @参数 VALUEIN 默认情况下,是mr框架所读到的一行文本内容 -->String类型
 * 同上用Text
 * <p>
 * @参数 KEYOUT 是用户自定义逻辑处理完成之后输出数据中的key,在此处是单词,-->String类型
 * <p>
 * @参数 VALUEOUT 是用户自定义逻辑处理完之后输出数据中的value,在此处单词次数-->int类型
 * <p>
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    /**
     * map阶段的业务逻辑就写在自定义的map()方法中
     * map task会对每一行输入数据调用一次我们自定义的map()方法
     *
     * @param key
     * @param value
     * @param context
     * @throws IOException
     * @throws InterruptedException
     */
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {


        // 将map task传给我们的文本内容先转化成String
        String line = value.toString();
        // 根据空格将这一行切分成单词
        String[] words = line.split(" ");

        // 将单词输出为<单词,1>
        for (String word : words) {
            // 将单词作为key,将次数1作为value,以便于后续的数据分发,
            // 以便于相同单词会到相同的reduce task

            context.write(new Text(word),new IntWritable(1));
        }

    }
}
