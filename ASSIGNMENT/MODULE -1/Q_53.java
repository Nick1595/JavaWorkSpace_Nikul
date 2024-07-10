package assignmentJava_coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class Q_53 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);

        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + numbers);

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbers);
    }
}
