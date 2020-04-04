package Day_7;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络编程
 * @author xie19
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(byName.getLocalHost().isReachable(1000));//通过1秒的访问时间访问www.baidu.com是否可以访问,如果可以返回true
		System.out.println(InetAddress.getLocalHost());
	}
}
