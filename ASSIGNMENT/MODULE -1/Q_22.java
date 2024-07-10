package assignmentJava_coreJava;

public class Q_22 {

	public void printarea(int side)
	{
		int area = side * side  ;
		System.out.println("The area of square is :"+ area);
	}
	
	public void printarea(int length , int breadth)
	{
		int area = length * breadth ;
		System.out.println("The area Of rectangle is :"+ area);
	}
	
	public static void main(String[] args) {
		Q_22 shape = new Q_22();
		
		shape.printarea(5);
		shape.printarea(10,12);
	}
}
