package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpSend {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();
        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            //输入的数据是111，发送数据结束
            if ("111".equals(s)) {
                break;
            }
            //创建数据，并把数据打包
            byte[] bys = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.4"), 12345);

            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);
        }
        //关闭发送端
        ds.close();
    }
}