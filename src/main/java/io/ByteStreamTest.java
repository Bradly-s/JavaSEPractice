package io;

import java.io.*;

public class ByteStreamTest {

    /**
     * 字节流写数据(字节输出流)的三种方式
     */
    public static void createFileOutputStreamWay() throws IOException {

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("F:\\JAVA_PRACTICE\\fos.txt");
//        fos = new FileOutputStream(new File("F:\JAVA_PRACTICE\\fos.txt"));

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);
//        fos.write(102);


//        byte[] bys = {97, 98, 99, 100, 101, 102};
            //getBytes()：返回字符串对应的字节数组
            byte[] bys = "abcdefgh".getBytes();

//        fos.write(bys);
            //write(byte[] b, int off, int len)
//        fos.write(bys,0,bys.length);
//        fos.write(bys,1,3);

            for (int i = 0; i < 20; ++i) {
                fos.write(bys);
                //        换行
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    //释放资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字节流读数据(字节输入流)
     * */
    public static void fileInputStream() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\JAVA_PRACTICE\\fos.txt");

//        一次读一个字节数据
//        int by;
//        /*
//            fis.read()：读数据
//            by=fis.read()：把读取到的数据赋值给by
//            by != -1：判断读取到的数据是否是-1(结束)
//         */
//        while ((by=fis.read())!=-1) {
//            System.out.print((char)by);
//        }

//        一次读一个字节数组数据
        byte[] bys = new byte[1024]; //1024及其整数倍
        int len;
        //循环读取
        while ((len=fis.read(bys))!=-1) {
            System.out.print(new String(bys,0,len));
        }

        fis.close();
    }

    /**
     * 字节缓冲流
     * */
    public static void byteBufferStream() throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\JAVA_PRACTICE\\bos.txt"));
//        //写数据
//        bos.write("good\r\n".getBytes());
//        bos.write("morning\r\n".getBytes());
//        //释放资源
//        bos.close();


        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\JAVA_PRACTICE\\bos.txt"));

        //一次读取一个字节数据
//        int by;
//        while ((by=bis.read())!=-1) {
//            System.out.print((char)by);
//        }

        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1) {
            System.out.print(new String(bys,0,len));
        }

        bis.close();
    }


    public static void main(String[] args) throws IOException {
//        createFileOutputStreamWay();

//        fileInputStream();

        byteBufferStream();
    }

}

