package assignment0210;

public class TestCar {

	public static void main(String[] args) {
		Engine engine = new Engine("Rolls Royce", 2016);
		engine.start();
		engine.stop();
		engine.display();
		Car car = new Car("BMW", "Mercedes", engine);
		car.start();
		car.stop();
		System.out.println("=============================");
		car.carDisplay();

	}

}
