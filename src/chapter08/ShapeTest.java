package chapter08;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		
		// 배열 생성 - import java.util.ArrayList; 활용
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		// 상속 개체 생성
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Rectangle());
		
		for(Shape item : list) {
			item.draw();
		}
		System.out.println();
		
		// 배열 생성
		Shape[] array = new Shape[3];
		
		// 개체 생성 - 클래스 형
		array[0] = new Circle();
		array[1] = new Triangle();
		array[2] = new Rectangle();
		

		for(Shape item : array) {
			item.draw();
		}	

		
	}
}

// 부모 클래스
class Shape{
	void draw()
	{
		System.out.println("Shape");
	}
}

// 상속받은 클래스 - Circle 
class Circle extends Shape{
	void draw()
	{
		System.out.println("Circle");
	}
}

//상속받은 클래스 - Rectangle
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Rectangle");
	}
}

//상속받은 클래스 - Triangle
class Triangle extends Shape{
	void draw()
	{
		System.out.println("Triangle");
	}
}


