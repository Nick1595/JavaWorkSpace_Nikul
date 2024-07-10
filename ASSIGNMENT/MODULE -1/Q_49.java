//Write a Java program to retrieve an element (at a specified index) from a given array list.  

package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_49 {

	  public static void main(String[] args) {
	       
	        ArrayList<String> colors = new ArrayList<>();

	       
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Retrieve element at index 2 (third element)
	        int index = 2;
	        if (index >= 0 && index < colors.size()) {
	            String element = colors.get(index);
	            System.out.println("Element at index " + index + ": " + element);
	        } else {
	            System.out.println("Index " + index + " is out of bounds");
	        }
	    }
}
