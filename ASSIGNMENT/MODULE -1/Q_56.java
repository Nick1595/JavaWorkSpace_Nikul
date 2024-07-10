package assignmentJava_coreJava;

import java.util.HashSet;

public class Q_56 {

	 public static void main(String[] args) {
	        
	        HashSet<String> namesSet = new HashSet<>();

	    
	        namesSet.add("NIKUL");
	        namesSet.add("VIVEK");
	        namesSet.add("PARAM");

	        // Print the HashSet before appending
	        System.out.println("HashSet before appending: " + namesSet);

	        // Append an element to the HashSet
	        String newElement = "BIRJUU";
	        namesSet.add(newElement);

	        // Print the HashSet after appending
	        System.out.println("HashSet after appending '" + newElement + "': " + namesSet);
	    }
}
