package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
	
	public static void main(String[] args){
		Message m = new Message("Hello");
		System.out.println(m.Message());

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(3, 4);
		System.out.println("Периметр прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p1 = new Point(2,2);
		Point p2 = new Point(3,8);
		System.out.println("Расстояние между двумя точками p1 и p2 = " + distance(p1,p2)); // Вычисление с помощью функции
		System.out.println("Расстояние между двумя точками p1 и p2 = " + p1.distance(p2)); // Вычисление с помощью метода
	}

	// функция для решения по заданию п. 2.1, 2.2, 2.3
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	}


}