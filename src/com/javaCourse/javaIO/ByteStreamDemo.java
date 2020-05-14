package com.javaCourse.javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("C:\\Users\\albno\\Desktop\\Course\\TestProjects\\course-test.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\albno\\Desktop\\Course\\TestProjects\\output-of-course.txt", false);

            int aBit;

            while ((aBit = fileInputStream.read()) != -1) {
                System.out.println(aBit);
                fileOutputStream.write(aBit);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
