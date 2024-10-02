package assignment0210;

public class Person {
	private final String name="Siddhi";
	private final int age=22;
	
	
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println(person);
	}
	
	
	
	


}
