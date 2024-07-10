package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_7 {

public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter a positive number : ");
		int integer = num.nextInt();
		
		System.out.println("\nnumber is : " + integer);		
		int count = 0;
	
		while (integer != 0)
		{
			integer /= 10;
			count++;
		}
		
		System.out.println("the number of digits are : " + count);

		num.close();
		
	}

}
