package com.flwcy.io;

import com.flwcy.entity.Student;
import org.junit.Test;

import java.io.*;

public class SaveBeanTest {

    @Test
    public void test(){
        Student student = new Student(1,"flwcy",18);
        //write(student,"E:/student.save");
        read("E:/student.save");
    }

    /**
     * 将student对象保存到本地磁盘
     * @param student
     */
    public void write(Student student,String fileName){
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out != null)
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    /**
     * 从本地磁盘读取对象
     * @param fileName
     * @return
     */
    public Student read(String fileName){
        Student student = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(fileName));
            student = (Student) in.readObject();
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return student;
    }
}
