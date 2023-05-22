package com.t2;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
public class mkdir {
    public static void main(String[] args) throws IOException {

        System.setProperty("HADOOP_USER_NAME", "root");
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        FileSystem fs=FileSystem.get(conf);
//        在 HDFS 上创建一个目录 "hdfs:/flume/1"，并将结果保存在布尔类型的变量 isok 中。
        boolean isok=fs.mkdirs(new Path("hdfs:/flume/1"));
        if(isok){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
        fs.close();

    }
}
