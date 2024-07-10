package assignmentJava_coreJava;

public class Q_12 {

	public static void main(String[] args) {
		
		System.out.println( " NUMBER BETWEEN 1-100:");
		
		for (int i = 1 ; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(i +" NUMBER IS DIVISIBLE BT BOTH  5 AND 3");
			}
			
			else if (i % 3 == 0)
			{
				System.out.println(i +" NUMBER IS DIVISIBLE BY 3 ");
			}
			
			else if (i % 5 == 0)
			{
				System.out.println(i +" NUMBER IS DIVISIBLE BY 5");
			}
			
		}
	}
}


