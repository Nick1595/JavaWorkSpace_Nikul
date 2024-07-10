package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_3 {

public static void main(String[] args) {
		
		Scanner leapYear = new Scanner(System.in);
		
		System.out.println("Enter the Year : ");
		int year = leapYear.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year+" is a Leap Year.");
		}
		else
		{
			System.out.println(year+" is not a Leap Year.");
		}
		
		leapYear.close();
		
	}
}
