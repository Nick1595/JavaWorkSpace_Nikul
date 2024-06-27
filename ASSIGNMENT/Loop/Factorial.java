	package Loop;

public class Factorial {
	public static void main(String[] args) {
		
		int row ;
		int fact = 1;
		for(row = 5; row >1; row--)
		{
			System.out.println(fact=(fact*row));
		}
		System.out.println("factorial of 5 is :"+fact);
		
		
	}
}
