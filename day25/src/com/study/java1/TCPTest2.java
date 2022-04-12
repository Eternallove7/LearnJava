package com.study.java1;

import org.junit.Test;

import javax.swing.*;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题2：客户端发送文件给服务端，服务端文件保存在本地
 *
 * @author RenAshbell
 * @create 2022-04-12-16:27
 */

public class TCPTest2 {
    /*
    这里涉及的异常应使用try-catch-finally处理
     */
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("localhost"),9090);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream("qq.jpg");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream("qq2.jpg");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        System.out.println("接收成功");

        fos.close();
        is.close();
        socket.close();
        ss.close();
    }

}
