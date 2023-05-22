package com.t7;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class downlocal {
    public static void main(String[] args) throws Exception {
        System.setProperty("HADOOP_USE R_NAME", "root");
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        FileSystem fs = FileSystem.get(conf);
        Path src=new Path("hdfs:/1.txt");
        Path dst=new Path("D:\\");
        fs.copyToLocalFile(false,src,dst,true);
        System.out.println("ok");
    }
}
