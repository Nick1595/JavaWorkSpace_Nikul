package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_63 {

	
	  public static void main(String[] args) {
	       
	        ArrayList<String> list1 = new ArrayList<>();
	        ArrayList<String> list2 = new ArrayList<>();

	      
	        list1.add("Apple");
	        list1.add("Orange");
	        list1.add("Banana");

	      
	        list2.add("Apple");
	        list2.add("Orange");
	        list2.add("Banana");

	        boolean isEqual = list1.equals(list2);

	      
	        if (isEqual) {
	            System.out.println("The ArrayLists are equal.");
	        } else {
	            System.out.println("The ArrayLists are not equal.");
	        }
	    }
}
