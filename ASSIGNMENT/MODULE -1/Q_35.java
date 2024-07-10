package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_35 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter two numbers (separated by space): ");
	            int num1 = scanner.nextInt();
	            int num2 = scanner.nextInt();
	            
	            // Perform division operation
	            if (num2 == 0) {
	                throw new ArithmeticException("Division by zero is not allowed");
	            }
	            int result = num1 / num2;
	            
	            System.out.println("Division result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception in thread main " + e);
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            scanner.close();
	            
	        }
	        
	    }

}
