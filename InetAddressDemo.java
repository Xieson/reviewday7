package Day_7;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ������
 * @author xie19
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(byName.getLocalHost().isReachable(1000));//ͨ��1��ķ���ʱ�����www.baidu.com�Ƿ���Է���,������Է���true
		System.out.println(InetAddress.getLocalHost());
	}
}
