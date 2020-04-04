package Day_7;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客服端
 * @author xie19
 *
 */
public class SocketDemo {
	public static void main(String[] args) throws Exception{
		//1:创建客服端对象
		Socket socket = new Socket(InetAddress.getLocalHost(),10010);
		Scanner scanner = new Scanner(socket.getInputStream());
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		socket.close();
		scanner.close();
	}
}
