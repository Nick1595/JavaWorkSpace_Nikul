package assignmentJava_coreJava;

import java.util.ArrayList;
import java.util.List;

public class Q_62 {

	public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();

       
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");

     
        System.out.println("ArrayList before extracting sublist: " + colors);

        // Extract a portion (sublist) of the ArrayList
        List<String> sublist = colors.subList(1, 4); // Extracts elements from index 1 to 3 (exclusive)

      
        System.out.println("Extracted sublist: " + sublist);
    }
}
