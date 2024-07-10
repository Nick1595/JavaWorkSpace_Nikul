package assignmentJava_coreJava;

import java.util.Scanner;

public class Q_8 {

	public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Letters: " + letterCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Other characters: " + otherCount);

       
    }
}
