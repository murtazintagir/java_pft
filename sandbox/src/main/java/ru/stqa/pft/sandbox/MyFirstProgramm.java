package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
	
	public static void main(String[] args){
		hello("world");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(3, 4);
		System.out.println("Периметр прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String somedody){
		System.out.println("Hello, " + somedody + "!");


	}

}