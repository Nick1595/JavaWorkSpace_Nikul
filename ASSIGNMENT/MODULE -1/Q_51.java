package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_51 {

    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();

        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the ArrayList before removal
        System.out.println("ArrayList before removal: " + colors);

        // Remove element at index 2 (third element)
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            String removedElement = colors.remove(indexToRemove);
            System.out.println("Removed element at index " + indexToRemove + ": " + removedElement);
        } else {
            System.out.println("Index " + indexToRemove + " is out of bounds");
        }

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + colors);
    }
}
