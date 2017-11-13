package com.flwcy.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 */
public class ConvertStreamDemo {

    public static void main(String[] args){
        new ConvertStreamDemo().readLine();
    }

    public void readLine(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            while((str = reader.readLine()) != null){
                if(str.equals("exit"))
                    break;
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
