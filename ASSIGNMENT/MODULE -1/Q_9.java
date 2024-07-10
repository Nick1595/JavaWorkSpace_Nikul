package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENTER ANY CHARACTER :");
		char character = scanner.next().charAt(0);
		
		
		int asciiValue = (int) character ;
	
		System.out.println("AsciiValue of "+character+"is:"+asciiValue);
		
		scanner.close();
	}
}
