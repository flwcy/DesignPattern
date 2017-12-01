package com.flwcy.io;

import java.io.*;

/**
 * IO流复习
 */
public class StreamDemo {
    public static void main(String[] args) {
        //new StreamDemo().read(new File("E:/404.txt"));
        new StreamDemo().write(new File("E:/404.txt"), new File("E:/404_temp.txt"));
    }

    /**
     * 通过文件输入流读取文件
     *
     * @param file
     */
    public void read(File file) {
        if (file.exists()) {
            // 定义流
            FileInputStream in = null;
            try {
                // 创建流
                in = new FileInputStream(file);
                // 创建一个字节数组来存储读取的数据
                byte[] b = new byte[1024];
                // 使用一个整数len来表示读取的长度
                int len = -1;
                // 循环读取数据，只要len大于0说明读取到元素，可以直接对元素进行操作
                while((len = in.read(b)) > 0){
                    System.out.write(b,0,len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    //读取完成后使用close方法关闭流
                    if(in != null)
                        in.close();
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
           FileInputStream in = null;
           FileOutputStream out = null;

            try {
                in = new FileInputStream(file);
                // 创建一个文件输出流
                out = new FileOutputStream(sourceFile);
                byte[] b = new byte[1034];
                int len = -1;
                // 将数据通过输入流读取到程序中
                while((len = in.read(b)) > 0){
                    // 将数据通过输出流输出，此时是一个文件输出流，就把数据输出到文件中
                    out.write(b,0,len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //关闭流
                try {
                    if(out != null)
                    {
                        out.close();
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                try {
                    if(in != null)
                    {
                        in.close();
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
