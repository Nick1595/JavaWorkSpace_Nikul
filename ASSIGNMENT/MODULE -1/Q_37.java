package assignmentJava_coreJava;

public class Q_37 {

	 public static void main(String[] args) {
	        try {
	            try {
	                int[] a = new int[5];
	                a[5] = 30 / 0; 
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Nested try-catch: ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	            }
	        } catch (ArithmeticException e) {
	            System.out.println("Outer try-catch: ArithmeticException caught: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Outer try-catch: Exception caught: " + e.getMessage());
	        } finally {
	            System.out.println("Finally");
	        }
	    }
}
