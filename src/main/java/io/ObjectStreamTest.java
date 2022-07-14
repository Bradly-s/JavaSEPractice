package io;

import java.io.*;

public class ObjectStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\JAVA_PRACTICE\\oos.txt"));
        Student student = new Student();
        student.setName("张三");
        student.setAge(21);
        oos.writeObject(student);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\JAVA_PRACTICE\\oos.txt"));
        Object obj = ois.readObject();
        Student student3 = (Student) obj;
        System.out.println(student3.getName() + ";" + student3.getAge());
        ois.close();
    }
}
