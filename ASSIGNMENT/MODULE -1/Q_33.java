package assignmentJava_coreJava;

class Shape1
{
	void print()
	{
		System.out.println("This is shape.");
	}
}

class Rectangle1 extends Shape1
{
	void print()
	{
		System.out.println("This is rectangular shape.");
	}
}

class Circle extends Shape1
{
	void print()
	{
		System.out.println("This is circular shape.");
	}
}

class Square1 extends Shape1
{
	void square()
	{
		System.out.println("Square is a rectangle.");
	}
}

public class Q_33 {
	
	public static void main(String[] args) {
		
		Square1 square = new Square1();
		
		square.print();
		square.square();		
		
	}

}