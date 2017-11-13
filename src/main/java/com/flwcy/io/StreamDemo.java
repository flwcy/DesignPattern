package com.flwcy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流复习
 */
public class StreamDemo {
    public static void main(String[] args) {
        new StreamDemo().read(new File("E:/404.txt"));
        new StreamDemo().write(new File("E:/404.txt"), new File("E:/404_temp.txt"));
    }

    /**
     * 通过文件输入流读取文件
     *
     * @param file
     */
    public void read(File file) {
        if (file.exists()) {
            //创建流
            FileInputStream fileInputStream = null;
            try {
                // 创建流
                fileInputStream = new FileInputStream(file);
                // 定义字节数组
                byte[] b = new byte[1024];
                int len = 0;
                while ((len = fileInputStream.read(b)) != -1) {
                    System.out.write(b);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 关闭流，释放资源
                try {
                    if (fileInputStream != null)
                        fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * @param file       需要读取的文件
     * @param sourceFile 目标文件
     */
    public void write(File file, File sourceFile) {
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                fileOutputStream = new FileOutputStream(sourceFile);
                // 读取文件
                byte[] b = new byte[1024];
                int len = 0;
                while ((len = fileInputStream.read(b)) != -1) {
                    fileOutputStream.write(b, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileOutputStream != null)
                        fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (fileInputStream != null)
                        fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
