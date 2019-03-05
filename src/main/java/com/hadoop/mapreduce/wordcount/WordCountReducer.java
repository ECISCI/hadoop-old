package com.hadoop.mapreduce.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author Ming
 * @实现 Reducer泛型 --> kEYIN  VALUEIN   KEYOUT   VALUEOUT
 * @参数 KEYIN VALUEIN 对应mapper输出的KEYOUT,VALUEOUT类型对应
 * @参数 KEYOUT VALUEOUT 是自定义reduce逻辑处理结果的输出数据类型
 * <p>
 * KEYOUT是单词
 * <p>
 * VALUEOUT是总次数
 */
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    /**
     * @param key
     * @param values
     * @param context
     * @throws IOException
     * @throws InterruptedException
     */
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        int count = 0;


//        Iterator<IntWritable> iterator = values.iterator();
//        while (iterator.hasNext()) {
////            count += iterator.next().get();
////        }

        for (IntWritable value : values) {

            count += value.get();
        }

        context.write(key, new IntWritable(count));
        // 将结果写到hdfs文件中
    }
}
