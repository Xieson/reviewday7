package Day_7;
class Demo2 extends Demo1{
	public Demo2() {
		super();//继承之后默认有个super();调用父类无参构造器
		System.out.println("Demo2.....");
	}
	public static void main(String[] args) {
		Demo2 de1=new Demo2();
		Demo1 de=new Demo1();
	}
}