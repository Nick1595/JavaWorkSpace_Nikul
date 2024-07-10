package assignmentJava_coreJava;

import java.util.HashSet;

public class Q_66 {

	 public static void main(String[] args) {
	        HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("Apple");
	        hashSet.add("Orange");
	        hashSet.add("Banana");
	        hashSet.add("Grapes");
	        hashSet.add("Mango");

	        // Convert HashSet to an array of Strings
	        String[] array = new String[hashSet.size()];
	        hashSet.toArray(array);

	        // Print the elements of the array
	        System.out.println("Array elements from HashSet:");
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
}
