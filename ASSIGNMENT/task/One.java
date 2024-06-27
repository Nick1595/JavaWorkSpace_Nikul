package Test;
import java.util.Scanner;
public class One {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a single character from the alphabet: ");
	        String input = scanner.next();

	        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
	            char ch = Character.toLowerCase(input.charAt(0));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println("Vowel");
	            } else {
	                System.out.println("Consonant");
	            }
	        } else {
	            System.out.println("Error: Please enter a single letter from the alphabet.");
	        }

	        scanner.close();
	    }
	}

	
	
	
	


