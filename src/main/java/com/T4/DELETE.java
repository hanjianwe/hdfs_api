package com.T4;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class DELETE {
    public static void main(String[] args) throws Exception{
        System.setProperty("HADOOP_USER_NAME", "root");
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        FileSystem fs=FileSystem.get(conf);
//        要删除的路径
        Path path=new Path("hdfs:/flume/1");

        boolean isok=fs.deleteOnExit(path);
        if(isok){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
        fs.close();

    }
}
