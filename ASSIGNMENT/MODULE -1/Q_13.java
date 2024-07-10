package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_13 {
	public static void main(String[] args) {
		 String originalString = "Tops Technologies!";
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Original String: " + originalString);
	        System.out.print("Enter the index to get the character (0 to " + (originalString.length() - 1) + "): ");
	        int index = scanner.nextInt();

	        if (index >= 0 && index < originalString.length()) {
	            char characterAtIndex = originalString.charAt(index);
	            System.out.println("The character at position " + index + " is " + characterAtIndex);
	        } else {
	            // Print an error message if the index is out of range
	            System.out.println("Invalid index! Please enter an index between 0 and " + (originalString.length() - 1) + ".");
	        }
	        
	     
	}
}
