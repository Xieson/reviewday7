package Day_7;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��������
 * @author xie19
 *
 */
public class ServerSocketDemo {
	public static void main(String[] args) throws Exception {
		//1:������������
		ServerSocket serverSocket = new ServerSocket(10010);
		System.out.println("�������ѿ���");
		boolean flag=true;
		while(flag) {
		Socket accept = serverSocket.accept();//�������ӹ����Ŀͷ���
		System.out.println(accept.getLocalAddress());
		PrintStream printStream = new PrintStream(accept.getOutputStream());
		printStream.print("��ð�,���!!! 111");
		accept.close();
		}
		serverSocket.close();
		}
}
