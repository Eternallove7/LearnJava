package com.study.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端
 * 并关闭相应链接
 * @author RenAshbell
 * @create 2022-04-12-16:34
 */
public class TCPTest3 {


    @Test
    public void client() throws IOException {
        // 1.
        Socket socket = new Socket(InetAddress.getByName("localhost"),9090);
        // 2.
        OutputStream os = socket.getOutputStream();
        // 3.
        FileInputStream fis = new FileInputStream("qq.jpg");
        // 4.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        // 关闭数据的输出
        socket.shutdownOutput();

        // 5.接收来自于服务器端的反馈
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bufferr = new byte[1024];
        int len1;
        while ((len1 = is.read(bufferr)) != -1){
            baos.write(bufferr,0,len1);
        }
        System.out.println(baos.toString());

        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        // 1.
        ServerSocket ss = new ServerSocket(9090);
        // 2.
        Socket socket = ss.accept();
        // 3.
        InputStream is = socket.getInputStream();
        // 4.
        FileOutputStream fos = new FileOutputStream("qq3.jpg");
        // 5.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        System.out.println("接收成功");

        // 6.服务器端给予客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，图片已接收成功".getBytes());

        // 7.
        os.close();
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
