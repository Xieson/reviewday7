package Day_7;

public class InteriorDemo {
	private class InteriorDemo1{
		public InteriorDemo1() {
		System.out.println("InteriorDemo1....");
		}
	}
	public InteriorDemo() {
		InteriorDemo1 interiorDemo1 = new InteriorDemo1();
		System.out.println("InteriorDemo....");
	}
	public static void main(String[] args) {
		InteriorDemo interiorDemo = new InteriorDemo();
	}
}
