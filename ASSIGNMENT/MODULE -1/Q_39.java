package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_39 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();
	            validate(age);
	            System.out.println("Welcome to vote");
	        } catch (ArithmeticException e) {
	            System.out.println("Exception in thread main java.lang.ArithmeticException: not valid");
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	        
	        System.out.println("THANK YOU");
	    }
	    
	    public static void validate(int age) {
	        if (age < 18) {
	            throw new ArithmeticException("not valid");
	        }
	    }
}
