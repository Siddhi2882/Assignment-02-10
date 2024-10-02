package assignment0210;

import java.util.*;

abstract class GeometricShape {
	final double PI = 3.14;

	abstract public void area();

	abstract public void perimeter();

}

class Circle extends GeometricShape {
	Scanner sc = new Scanner(System.in);
	int r;

	public void area() {
		System.out.println("Enter the radius of circle ");
		r = sc.nextInt();
		System.out.println("Area of circle is " + PI * r * r);
	}

	public void perimeter() {
		System.out.println("Enter the radius of circle ");
		r = sc.nextInt();
		System.out.println("Perimeter of circle is " + 2 * PI * r);
	}
}

class Rectangle extends GeometricShape {
	Scanner sc = new Scanner(System.in);
	int l, b;

	public void area() {
		System.out.println("Enter the length and bradth of rectangle");
		l = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Area of Rectangle is " + l * b);
	}

	public void perimeter() {
		System.out.println("Enter the length and bradth of rectangle");
		l = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Perimeter of Rectangle is " + 2 * (l + b));
	}
}

class Triangle extends GeometricShape {
	private int side1;
	private int side2;
	private int side3;
	private double result;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public void area() {
		result = (side1 + side2 + side3) / 2;
		System.out.println("Area is =" + Math.sqrt((result * (result - side1) * (result - side2) * (result - side3))));

	}

	public void perimeter() {

		System.out.println("Perimeter of Triangle =" + (side1 + side2 + side3));

	}

}

public class TestGeometricShape {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.area();
		circle.perimeter();

		Rectangle rect = new Rectangle();
		rect.area();
		rect.perimeter();

		Triangle triangle = new Triangle(5, 6, 7);
		triangle.area();
		triangle.perimeter();

	}

}
