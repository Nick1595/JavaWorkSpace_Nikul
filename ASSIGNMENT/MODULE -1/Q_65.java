package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_65 {

	 public static void main(String[] args) {

		    ArrayList<String> list1 = new ArrayList<>();
	        ArrayList<String> list2 = new ArrayList<>();

	        list1.add("Apple");
	        list1.add("Orange");
	        list1.add("Banana");

	        list2.add("Grapes");
	        list2.add("Mango");
	        list2.add("Pineapple");

	        // Join (concatenate) the two ArrayLists
	        ArrayList<String> joinedList = new ArrayList<>(list1); // Create a new ArrayList initialized with list1
	        joinedList.addAll(list2); // Add all elements from list2 to joinedList

	        // Print the joined ArrayList
	        System.out.println("Joined ArrayList: " + joinedList);
	    }
}
