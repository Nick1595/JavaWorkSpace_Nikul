package Loop;

public class Reverse {
	public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original number: " + number);
        
        
        printReverse(number);
    }
    
    public static void printReverse(int number) {
        // Convert the number to a string to easily access individual digits
        String numberStr = String.valueOf(number);
        
        System.out.print("Number in reverse order: ");
        // Loop through the string in reverse and print each character
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            System.out.print(numberStr.charAt(i));
        }
    }
}
	