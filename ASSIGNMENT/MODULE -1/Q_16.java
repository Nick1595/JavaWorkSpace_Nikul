package assignmentJava_coreJava;
import java.util.Scanner;

public class Q_16 {

	



	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);

	
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	
	        System.out.print("Enter the suffix string: ");
	        String suffix = scanner.nextLine();

	
	        boolean endsWithSuffix = mainString.endsWith(suffix);

		        System.out.println("\"" + mainString + "\" ends with \"" + suffix + "\": " + endsWithSuffix);

		     scanner.close();
	    }
	}


