package assignmentJava_coreJava;

abstract class Shape
{
	abstract double RectangleArea(double length, double breadth);
	abstract double SquareArea(double side);
	abstract double CircleArea(double radius);
}

class Area
{
	double RectangleArea(double length, double breadth) {
		return length*breadth;
	}
	
	double SquareArea(double side)
	{
		return side*side;
	}
	
	double CircleArea(double radius)
	{
		return 3.14F * radius * radius;
	}
}

public class Q_32 {
	
	public static void main(String[] args) {
		
		Area area = new Area();
		System.out.println("Area of Rectangle : " + area.RectangleArea(8.0, 12.0));
		System.out.println("Area of Square : " + area.SquareArea(8.0));
		System.out.println("Area of Circle : " + area.CircleArea(5.3));
		
	}

}