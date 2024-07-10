package assignmentJava_coreJava;

import java.util.ArrayList;
import java.util.HashSet;

public class Q_67 {

	 public static void main(String[] args) {
	        // Create a HashSet of Strings
	        HashSet<String> hashSet = new HashSet<>();

	        // Add elements to the HashSet
	        hashSet.add("Apple");
	        hashSet.add("Samsung");
	        hashSet.add("vivo");
	        hashSet.add("mi");
	        hashSet.add("Oppo");

	        // Convert HashSet to ArrayList
	        ArrayList<String> arrayList = new ArrayList<>(hashSet);

	        // Print the ArrayList elements
	        System.out.println("ArrayList elements from HashSet:");
	        for (String element : arrayList) {
	            System.out.println(element);
	        }
	    }
}
