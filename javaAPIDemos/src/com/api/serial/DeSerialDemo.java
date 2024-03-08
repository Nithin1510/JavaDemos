package com.api.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialDemo {
    public static void main(String[] args) {

        System.out.println("Deserializing........");
        try (FileInputStream fileInputStream = new FileInputStream("student.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
           Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
