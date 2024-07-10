package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_54 {

	 public static void main(String[] args) {
	        // Create the source ArrayList
	        ArrayList<String> sourceList = new ArrayList<>();
	        sourceList.add("Apple");
	        sourceList.add("Samsung");
	        sourceList.add("Vivo");

	        // Create a new ArrayList and pass sourceList to its constructor
	        ArrayList<String> destinationList = new ArrayList<>(sourceList);

	        // Print both ArrayLists
	        System.out.println("Source ArrayList: " + sourceList);
	        System.out.println("Copied ArrayList: " + destinationList);
	    }
}
