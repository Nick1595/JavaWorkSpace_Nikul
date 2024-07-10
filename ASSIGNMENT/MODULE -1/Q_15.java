package assignmentJava_coreJava;
import java.util.Scanner;

public class Q_15 {

	

	public class CompareStringWithCharSequence {
	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first string: ");
	        String firstString = scanner.nextLine();

	      
	        System.out.print("Enter the second string (character sequence): ");
	        String secondString = scanner.nextLine();

	        
	        boolean areEqual = firstString.equals(secondString);

	        
	        System.out.println("Comparing \"" + firstString + "\" and \"" + secondString + "\": " + areEqual);

        scanner.close();
	    }
	}

}
