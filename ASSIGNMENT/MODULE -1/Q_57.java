package assignmentJava_coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class Q_57 {

	public static void main(String[] args) {

		HashSet<String> namesSet = new HashSet<>();

      
        namesSet.add("NIK");
        namesSet.add("DEV");
        namesSet.add("HARSH");

        // Using enhanced for-loop (for-each loop) to iterate through HashSet
        System.out.println("Iterating through HashSet using enhanced for-loop:");
        for (String name : namesSet) {
            System.out.println(name);
        }

        // Using Iterator to iterate through HashSet
        System.out.println("\nIterating through HashSet using Iterator:");
        Iterator<String> iterator = namesSet.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
