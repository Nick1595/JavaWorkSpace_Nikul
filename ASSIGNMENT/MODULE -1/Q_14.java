package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Enter The First String  ");
		String FirstString = scanner.nextLine();
		
		System.out.println("Enter The Second String  ");
		String SecondString = scanner.nextLine();
		
		String concatenatedString = FirstString + " "+ SecondString;
		
		System.out.println("Concated String is :"+ concatenatedString);
	}
}
