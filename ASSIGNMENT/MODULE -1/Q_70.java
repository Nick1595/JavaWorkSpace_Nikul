package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_70 {

	public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();


        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

      
        System.out.println("ArrayList before replacement: " + colors);

        if (colors.size() >= 2) { 
            colors.set(1, "Purple"); 
        } else {
            System.out.println("ArrayList doesn't have enough elements to replace the second element.");
        }

        // Print the ArrayList after replacement
        System.out.println("ArrayList after replacement: " + colors);
    }
}
