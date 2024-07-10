package assignmentJava_coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class Q_55 {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Print the ArrayList before shuffling
        System.out.println("ArrayList before shuffling: " + numbers);

        // Shuffle the ArrayList
        Collections.shuffle(numbers);

        // Print the ArrayList after shuffling
        System.out.println("ArrayList after shuffling: " + numbers);
    }
}
