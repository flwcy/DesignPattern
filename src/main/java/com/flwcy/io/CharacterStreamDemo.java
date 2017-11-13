package com.flwcy.io;
import java.io.*;
/**
 * 字符流
 * 读使用BufferReader
 * 写使用PrinterWriter
 */
public class CharacterStreamDemo {
    public static void main(String[] args){
        new CharacterStreamDemo().write(new File("E:/20160407185.txt"), new File("E:/404_temp.txt"));
    }

    public void write(File file,File sourceFile){
        BufferedReader reader = null;
        PrintWriter writer = null;
        if(file.exists()){
            try {
                reader = new BufferedReader(new FileReader(file));
                writer = new PrintWriter(new FileWriter(sourceFile));
                String str = null;
                while ((str = reader.readLine()) != null){
                    writer.println(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(writer != null)
                    writer.close();
                try {
                    if(reader != null)
                        reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
