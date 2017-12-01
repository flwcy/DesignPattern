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

    /**
     * 字符流
     * 读使用BufferReader
     * 写使用PrinterWriter
     * @param file
     * @param sourceFile
     */
    public void write(File file,File sourceFile){
        if(file.exists()){
            BufferedReader reader = null;
            PrintWriter writer = null;

            try {
                reader = new BufferedReader(new FileReader(file));
                // 使用文件字符流写文件，加上缓冲流提高效率，写用PrintWriter
                writer = new PrintWriter(new BufferedWriter(new FileWriter(sourceFile)));
                String str = null;
                while ((str = reader.readLine()) != null){
                    writer.println(str);
                }
            } catch (IOException e) {
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
