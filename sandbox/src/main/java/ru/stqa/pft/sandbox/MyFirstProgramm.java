package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
	
	public static void main(String[] args){
		hello("world");
		double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
		double a = 3;
		double b = 4;
		System.out.println("Периметр прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello(String somedody){
		System.out.println("Hello, " + somedody + "!");
	}

	public static double area(double l){
		return l *= l;
	}

	public static double area(double a, double b){
		return a * b;
	}

}