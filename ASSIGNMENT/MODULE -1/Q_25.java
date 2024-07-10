package assignmentJava_coreJava;

class Rectangle
{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth)
	{
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	
	double area()
	{
		return length * breadth;
	}
	
	double perimeter()
	{
		return 2 * (length + breadth);
	}
	
}

class Square extends Rectangle
{

	public Square(double Side) {
		// TODO Auto-generated constructor stub
		super(Side, Side);
	}
	
}


public class Q_25 {

public static void main(String[] args) {
		
		Rectangle areaRect = new Rectangle(8.0, 12.0);
		
		System.out.println("Area of Rectangle : " + areaRect.area());
		System.out.println("Perimeter of Rectangle : " + areaRect.perimeter());
		
		Square areaSqu = new Square(6.0);
		
		System.out.println("Area of Square : " + areaSqu.area());
		System.out.println("Perimeter of Square : " + areaSqu.perimeter());
		
	}


	
	
}
