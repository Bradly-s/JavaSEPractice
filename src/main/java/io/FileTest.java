package io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    /**
     * 路径名封装为File抽象表示 的三种方式
    * */
    public static void structureFile(){
//        File(String pathname): 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
        File file1 = new File("F:\\JAVA_PRACTICE\\file.txt");
        System.out.println(file1);

//        File(String parent, String child): 从父路径名字符串和子路径名字符串创建新的 File实例
        File file2 = new File("F:\\JAVA_PRACTICE","file.txt");
        System.out.println(file2);

//        File(File parent, String child): 从父抽象路径名和子路径名字符串创建新的 File实例
        File file3 = new File("F:\\JAVA_PRACTICE");
        File file4 = new File(file3,"file.txt");
        System.out.println(file4);
    }

    /**
     * 创建目录、文件、多级目录；删除文件、目录
     * */
    public static void createDelFile() throws IOException {
//        在F:目录下创建一个目录JavaSE
        File file1 = new File("F:\\JAVA_PRACTICE");
        System.out.println(file1.mkdir() ?"创建F:\\JAVA_PRACTICE成功！":"创建F:\\JAVA_PRACTICE失败！");
        System.out.println("--------");

//        在F:\JAVA_PRACTICE目录下创建一个文件file.txt
        File file2 = new File("F:\\JAVA_PRACTICE\\file.txt");
        System.out.println(file2.createNewFile() ?"创建F:\\JAVA_PRACTICE\\file.txt成功！":"创建F:\\JAVA_PRACTICE\\file.txt失败！");
        System.out.println("--------");

//        在F:\JAVA_PRACTICE目录下创建一个多级目录JavaWEB\\HTML
        File file3 = new File("F:\\JAVA_PRACTICE\\JavaWEB\\HTML");
        System.out.println(file3.mkdirs() ?"创建F:\\JAVA_PRACTICE\\JavaWEB\\HTML成功！":"创建F:\\JAVA_PRACTICE\\JavaWEB\\HTML失败！");
        System.out.println("--------");


//        删除目录时，应先删除目录中的所有文件；否则，不能删除目录
        File file4 = new File("F:\\JAVA_PRACTICE\\JavaWEB\\HTML\\javaaaa.xml");
        System.out.println(file4.createNewFile());
        File file5 = new File("F:\\JAVA_PRACTICE\\JavaWEB\\HTML");
        System.out.println(file5.delete());
    }

    public static void boolGetFile(){
        File file = new File("F:\\JAVA_PRACTICE\\JavaWEB\\HTML\\javaaaa.xml");
        System.out.println("是否为文件：" + file.isFile() + "\n" +
                            "是否为目录：" + file.isDirectory() + "\n" +
                            "是否存在：" + file.exists() + "\n" +
                            "绝对路径：" + file.getAbsolutePath() + "\n" +
                            "路径名字符串：" + file.getPath() + "\n" +
                            "名称：" + file.getName() + "\n" +
                            "---------------------------------");

//        listFiles
        File file2 = new File("F:\\JAVA_PRACTICE");
        File[] fileArray = file2.listFiles();
        System.out.println(fileArray.length);
        for(File file3 : fileArray) {
            if(file3.isFile()) {
                System.out.println(file3.getName());
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        structureFile();

//        createDelFile();

        boolGetFile();
    }
}


