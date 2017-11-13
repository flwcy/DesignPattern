package com.flwcy.io;

import java.io.*;
/**
 * 缓冲流
 */
public class BufferStreamDemo {
    public static void main(String[] args){
        write(new File("E:/20160407185.txt"), new File("E:/404_temp.txt"));
    }
    public static void write(File file,File sourceFile){
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        if(file.exists()){
            try {
                in = new BufferedInputStream(new FileInputStream(file));
                out = new BufferedOutputStream(new FileOutputStream(sourceFile));

                byte[] b = new byte[1024];
                int len = 0;
                while ((len = in.read(b)) != -1){
                    out.write(b,0,len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if(out != null){
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if(in != null){
                        in.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
