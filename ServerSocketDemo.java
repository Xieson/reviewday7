package Day_7;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 * @author xie19
 *
 */
public class ServerSocketDemo {
	public static void main(String[] args) throws Exception {
		//1:创建服务器端
		ServerSocket serverSocket = new ServerSocket(10010);
		System.out.println("服务器已开启");
		boolean flag=true;
		while(flag) {
		Socket accept = serverSocket.accept();//接收链接过来的客服端
		System.out.println(accept.getLocalAddress());
		PrintStream printStream = new PrintStream(accept.getOutputStream());
		printStream.print("你好啊,你好!!! 111");
		accept.close();
		}
		serverSocket.close();
		}
}
