package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_31 {
	static int factorial(int number)
	{
		if(number == 0|| number == 1)
    	{
    		return 1;
    	}
    	else
    	{
    		return number * factorial(number - 1);
    	}
	}
	
	public static void main(String[] args) {
		
		Scanner fact = new Scanner(System.in);
		
		System.out.println("Enter a number to calculate factorial : ");
		int num = fact.nextInt();
		
		if(num<0)
		{
			System.out.println("Factorial is not defined for the negative numbers.");
		}
		else
		{
			System.out.println("Factorial of " + num + " is " + factorial(num));
		}
		
		fact.close();
		
	}

}