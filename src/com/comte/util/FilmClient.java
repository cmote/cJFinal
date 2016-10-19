package com.comte.util;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class FilmClient {

	public static void main(String[] args) {
		for(int i = 0; i <= 2; i++){
			Client client = new Client();
			client.i = i;
			client.start();
		}
	}
}
class Client extends Thread{
	int i;
	@Override
	public void run(){
		Date date = new Date();
		// 1、 建立socket连接
		Socket client;
		try{
			client = new Socket("127.0.0.1", 1001);
			// 2、打开socket的流信息，准备下面的操作；
			OutputStream os = client.getOutputStream();
			// 3、写信息
			os.write(("e:/io/JavaGC.pdf").getBytes()); //这个是服务器端的文件的地址
			// 这是要下载到客户端的地址及文件名，这里相当于下载了两遍文件，只不过保存在客户端的时候起了两个不同的文件名，方便比较
			String fileName = "e:/film/JavaGC.pdf";
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			System.out.println("Time=" + date.getTime());
			
			//接收服务器端的文件并写到客户端，这里会一直等服务器端发消息过来，如果服务器sleep10s才发送过来，客户端也会一直等
			//这就是导致整个线路都会阻塞在这里
			InputStream is = client.getInputStream();
			
			byte[] b = new byte[1024];
			while(is.read(b) > 0) {
				fileOutputStream.write(b);
			}
			
			// 4、关闭socket
			// 先关闭输出流
			os.close();
			// 最后关闭socket
			client.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("Time1 = " + date.getTime());
	}
}
