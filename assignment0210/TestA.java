package assignment0210;
class A {
	public static void print()
	{
		System.out.println("Parent");
	}

}
class B extends A{
	public static void print()
	{
		System.out.println("Child");
	}
}
public class TestA{
	public static void main(String[] args) {
		A a=new A();
		a.print();
		
		B b=new B();
		b.print();
		
		a=new B();
		a.print();
	}
}

