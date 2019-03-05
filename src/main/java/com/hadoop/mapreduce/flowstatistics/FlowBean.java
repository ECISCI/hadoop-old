package com.hadoop.mapreduce.flowstatistics;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlowBean implements Writable {

    private long uFlow;
    private long dFlow;
    private long sFlow;

    public long getsFlow() {
        return sFlow;
    }

    public void setsFlow(long sFlow) {
        this.sFlow = sFlow;
    }

    public FlowBean(long uFlow, long dFlow) {

        this.uFlow = uFlow;
        this.dFlow = dFlow;
        this.sFlow = dFlow + uFlow;
    }

    // 反序列化时,需要反射调用空参数构造方法,所以要显示定义
    public FlowBean() {

    }


    public long getuFlow() {
        return uFlow;
    }

    public void setuFlow(long uFlow) {
        this.uFlow = uFlow;
    }

    public long getdFlow() {
        return dFlow;
    }

    public void setdFlow(long dFlow) {
        this.dFlow = dFlow;
    }

    /**
     * 序列化方法
     */
    @Override
    public void write(DataOutput out) throws IOException {

        out.writeLong(uFlow);
        out.writeLong(dFlow);
        out.writeLong(sFlow);
    }

    /**
     * 反序列化方法
     * <p>
     * 反序列化的顺序和序列化的顺序完全一致
     */
    @Override
    public void readFields(DataInput in) throws IOException {

        uFlow = in.readLong();
        dFlow = in.readLong();
        sFlow = in.readLong();

    }

    @Override
    public String toString() {
        return uFlow + "\t" + dFlow + "\t" + sFlow;
    }
}
