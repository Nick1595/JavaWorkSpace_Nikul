package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_47 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Iterate through the ArrayList using enhanced for-loop
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
