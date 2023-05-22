package com.t1;
import java.io.InputStream;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
public class duqu {
    public static void main(String[] args) throws Exception{
//      获取hdfs系统
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        FileSystem fs=FileSystem.get(conf);
//        通过 HDFS 文件系统对象打开一个输入流，用于读取 HDFS 上的一个文件 "hdfs:/1.txt"
        InputStream in = fs.open(new Path("hdfs:/1.txt"));
//        数据复制到标准输出流 System.out 中，4096 表示缓冲区大小，false 表示复制完毕后不关闭流。
        IOUtils.copyBytes(in,System.out,4096,false);
//        关闭输入流
        IOUtils.closeStream(in);
//        Configuration conf = new Configuration();
//        // 设置HDFS访问地址
//        conf.set("fs.default.name", "hdfs://192.168.11.130:9000");
//        // 取得FileSystem文件系统实例
//        FileSystem fs = FileSystem.get(conf);
//        // 打开文件输入流
//        InputStream in = fs.open(new Path("hdfs:/file.txt"));
//        // 输出文件内容
//        IOUtils.copyBytes(in, System.out, 4096, false);
//        // 关闭输入流
//        IOUtils.closeStream(in);
    }
}
