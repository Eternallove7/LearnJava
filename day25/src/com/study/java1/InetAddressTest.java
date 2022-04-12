package com.study.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程中有两个主要问题：
 * 1.如何准确定位网络上一台或多台主机；定位主机上的特定的应用
 * 2.找到主机后如何可靠高效地进行数据传输
 *
 * 二、网络编程中的两个要素：
 * 1.对应问题一：IP和端口号
 * 2.对应问题而：提供网络通信协议：TCP/IP参考模型
 *
 * 三、通信要素一：IP和端口号
 *
 * 1. IP：唯一的标识Internet上的计算机
 * 2. 在Java中使用InetAddress类代表IP
 * 3. IP分类：IPv4 和 IPv6 ； 万维网 和 局域网
 * 4. 域名：www.baidu.com
 * 5. 本地回路地址：127.0.0.1 对应着：localhost
 * 6. 如何实例化InetAddress：两个方法：getByName(String host) 、 getLocalHost()
 *
 *
 * @author RenAshbell
 * @create 2022-04-12-15:33
 */
public class InetAddressTest {
    public static void main(String[] args) {

        try {
            InetAddress inet1 = InetAddress.getByName("10.10.230.54");

            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            // 获取本地ip
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);

            // getHostName()
            System.out.println(inet2.getHostName());

            // getHostAddress(0
            System.out.println(inet2.getHostAddress());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
