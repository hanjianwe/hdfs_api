package com.T6;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class PUT {
    public static void main(String[] args) throws Exception{
        System.setProperty("HADOOP_USER_NAME", "root");
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        FileSystem fs = FileSystem.get(conf);
        Path src=new Path("D:\\學習\\1.txt");
        Path dst=new Path("hdfs:/");
        fs.copyFromLocalFile(src,dst);
        System.out.println("ok");


    }
}
