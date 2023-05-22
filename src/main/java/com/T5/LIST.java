package com.T5;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class LIST {
    private static FileSystem hdfs;

    public static void main(String[] args) throws Exception{
        System.setProperty("HADOOP_USER_NAME", "root")
        Configuration conf=new Configuration();
        conf.set("fs.default.name","hdfs://192.168.11.130:9000");
        hdfs=FileSystem.get(conf);
        FileStatus[] fs=hdfs.listStatus(new Path("hdfs:/"));
        if(fs.length>0){
            for (FileStatus f:fs) {
                showdir(f);
            }
        }
    }
    public static void showdir(FileStatus fs) throws Exception{
        Path path=fs.getPath();
        System.out.println(path);
        if(fs.isDirectory()){
            FileStatus[] f=hdfs.listStatus(path);
            if (f.length>0){
                for (FileStatus file:f){
                    showdir(file);
                }
            }
        }
    }
}
