package io;

import java.io.*;

public class ConvertStreamTest {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\JAVA_PRACTICE\\osw.txt"),"GBK");
        osw.write("今天是个好日子");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\JAVA_PRACTICE\\osw.txt"),"GBK");
        //一次读取一个字符数据
        int chr;
        while ((chr=isr.read())!=-1) {
            System.out.print((char)chr);
        }
        isr.close();
    }
}

