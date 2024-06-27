package Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CompareFloats {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	 
        
        // Get two floating-point numbers from the user
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Round the numbers to 2 decimal places
        double roundedNum1 = roundToTwoDecimalPlaces(num1);
        double roundedNum2 = roundToTwoDecimalPlaces(num2);
        
        // Compare the rounded numbers
        if (roundedNum1 == roundedNum2) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
    }
    
    // Method to round a number to two decimal places
    public static double roundToTwoDecimalPlaces(double number) {
        BigDecimal bd = BigDecimal.valueOf(number);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
