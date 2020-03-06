package com.it521.redis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 玛丽莲梦明
 */
public class JedisTest {

    public static void main(String[] args) {


        try {
//            testJedis();
            testJedisPool();
//            testJedisCluster();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试Jedis
     *
     * @throws Exception
     */
    public static void testJedis() throws Exception {

        // 1.创建Jedis对象,传入参数为redis IP及端口号
        Jedis jedis = new Jedis("192.168.25.128", 6379);

        // 2.直接操作redis 将数据保存到Jedis中 以键值对的形式
        jedis.set("ming", "this is jedis test value");

        // 3.从redis中将数据取出来
        String ming = jedis.get("ming");

        // 4.打印Jedis中取出的数据
//        XLogUtil.i("拿到的jedis数据:" + ming);

        // 5.关闭jedis连接
        jedis.close();
    }

    /**
     * 测试JedisPool
     *
     * @throws Exception
     */
    public static void testJedisPool() throws Exception {

        JedisPool jedisPool = new JedisPool("192.168.25.128", 6379);

        Jedis jedis = jedisPool.getResource();

        String ming = jedis.get("ming");

        jedis.close();

        jedisPool.close();

    }

    /**
     * 连接集群
     *
     * @throws Exception
     */
    public static void testJedisCluster() throws Exception {

        // 创建一个JedisCluster对象,有一个参数nodes是一个set类型
        // set里包含若干个HostAndPort对象
        Set<HostAndPort> nodes = new HashSet<>();

        nodes.add(new HostAndPort("192.168.25.128", 7001));
        nodes.add(new HostAndPort("192.168.25.128", 7002));
        nodes.add(new HostAndPort("192.168.25.128", 7003));

        nodes.add(new HostAndPort("192.168.25.128", 7004));
        nodes.add(new HostAndPort("192.168.25.128", 7005));
        nodes.add(new HostAndPort("192.168.25.128", 7006));

        JedisCluster jedisCluster = new JedisCluster(nodes);

        jedisCluster.set("resource", "这是我测试集群存入的数据");

        String resource = jedisCluster.get("resource");

        jedisCluster.close();


    }
}
