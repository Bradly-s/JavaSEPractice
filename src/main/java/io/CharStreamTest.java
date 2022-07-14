package io;

import java.io.*;

public class CharStreamTest {
    private static final String file = "F:\\JAVA_PRACTICE\\char_streamm.txt";
    private static final String fileName = "F:\\JAVA_PRACTICE\\bw.txt";

    /**
     * 字符流写数据
     * */
    public static void charStreamWrite() throws IOException {
        FileWriter fw = new FileWriter(file);

        //写一个字符
//        fw.write(97);
//        fw.write(98);
//        fw.write(99);
//        fw.write(102);

        //写入一个字符数组
//        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
//        fw.write(chs);

        //写入字符数组的一部分
//        fw.write(chs, 0, chs.length);
//        fw.write(chs, 1, 3);

        //写一个字符串
//        fw.write("abcdefghi");

        //写一个字符串的一部分
//        fw.write("abcdefghi", 0, "abcdefghi".length());
        fw.write("abcdefghi", 1, 5);

        //释放资源
        fw.close();
    }

    /**
     * 字符流读数据
     * */
    public static void charStreamReader() throws IOException {
        FileReader fr = new FileReader(file);

        //int read()：一次读一个字符数据
//        int ch;
//        while ((ch=fr.read())!=-1) {
//            System.out.print((char)ch);
//        }

        //int read(char[] cbuf)：一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        fr.close();
    }

    /**
     * 字符缓冲流
     * */
    public static void charBufferStream() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        bw.write("good\r\n");
//        bw.write("afternoon\r\n");
        for (int i = 0; i < 9; i++) {
            bw.write(i + "good afternoon");
            bw.newLine();
            bw.flush();
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

//        一次读取一个字符数据
        int chr;
        while ((chr=br.read())!=-1) {
            System.out.print((char)chr);
        }

//        //一次读取一个字符数组数据
//        char[] chs = new char[1024];
//        int len;
//        while ((len=br.read(chs))!=-1) {
//            System.out.print(new String(chs,0,len));
//        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
//        charStreamWrite();
//
//        charStreamReader();

        charBufferStream();
    }
}

