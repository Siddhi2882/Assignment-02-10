package assignment0210;
abstract class Animal{
	abstract void sound();
	abstract void move();
}
class Dog extends Animal{
	public void sound()
	{
		System.out.println("The Dog barkss....");
	}
	public void move()
	{
		System.out.println("Dog can move...");
	}
}
class Cat extends Animal{
	public void sound()
	{
		System.out.println("The Cat meowwss....");
	}
	public void move()
	{
		System.out.println("Cat can move...");
	}
}
class Bird extends Animal{
	public void sound()
	{
		System.out.println("The Birdss Chirps....");
	}
	public void move()
	{
		System.out.println("Bird can fly...");
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sound();
		dog.move();
		
		Cat cat=new Cat();
		cat.sound();
		cat.move();
		
		Bird bird=new Bird();
		bird.sound();
		bird.move();

	}

}
