package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_10 {
	
	 public static void main(String[] args) {
	        
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Enter an integer: ");
				int n = scanner.nextInt();

				String nStr = Integer.toString(n);

				
				String nnStr = nStr + nStr;        
				String nnnStr = nStr + nStr + nStr; 

				
				int nn = Integer.parseInt(nnStr);
				int nnn = Integer.parseInt(nnnStr);

				
				int result = n + nn + nnn;

				
				System.out.println("The result of n + nn + nnn is: " + result);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        
	    }
}
