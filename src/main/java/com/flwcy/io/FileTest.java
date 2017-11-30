package com.flwcy.io;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest {

    @Test
    public void test() throws IOException {
        // 初始化File对象
        File file = new File("D:/abc");
        // 在abc目录下创建对应的文件，abc目录必须存在，否则抛出java.io.IOException: 系统找不到指定的路径
        File fileChild = new File(file ,"test.text");
        //等同于如下代码
        // File newFile = new File("D:/abc","test.text");
        // 创建文件
        fileChild.createNewFile();
    }

    @Test
    public void mkdirs(){
        File file = new File("D:/abc");
        // 使用文件过滤器
        String[] fileNames = file.list(new FilenameFilter() {
            // 匿名内部类实现了FilenameFilter接口
            // 实现接口中的方法
            public boolean accept(File dir, String name) {
                if(name.endsWith(".text"))
                    return true;
                return false;
            }
        });
        // 只有accept方法中返回true的文件名才会被返回到fileNames数组中
        for (String fileName : fileNames){
            System.out.println(fileName);
        }
    }
}
