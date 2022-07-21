package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        //确定主机名称的IP地址
        InetAddress address = InetAddress.getByName("192.168.1.4");

        //获取此IP地址的主机名
        String name = address.getHostName();
        //返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("address:" + address);
        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);
    }
}
