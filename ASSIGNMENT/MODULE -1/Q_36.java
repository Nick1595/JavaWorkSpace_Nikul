package assignmentJava_coreJava;

public class Q_36 {

	 public static void main(String[] args) {
	        try {
	            int[] a = new int[5];
	            a[5] = 30 / 0; // This line will throw both ArrayIndexOutOfBoundsException and ArithmeticException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	        }
	    }
}
