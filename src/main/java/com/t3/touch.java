package com.t3;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
public class touch {
    public static void main(String[] args) throws Exception{
        System.setProperty("HADOOP_USER_NAME", "root");
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        FileSystem fs=FileSystem.get(conf);
//        使用 HDFS 文件系统对象创建一个输出流 outputStream，用于将数据写入到目标文件 "hdfs:/flume/1/mewfile.txt" 中。
        FSDataOutputStream outputStream=fs.create(new Path(
                "hdfs:/flume/1/mewfile.txt"));
        outputStream.write("awdaw".getBytes());
        outputStream.close();
        fs.close();
        System.out.println("ok");
    }
}
