package assignmentJava_coreJava;

import java.util.HashSet;
import java.util.Set;

public class Q_72 {

    public static void main(String[] args) {
      
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("kivi");
        set1.add("Banana");
        set1.add("Grapes");

       
        set2.add("kivi");
        set2.add("Grapes");
        set2.add("Watermelon");
        set2.add("Pineapple");

       
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

       
        set1.retainAll(set2);

        System.out.println("Common elements retained: " + set1);
    }
}
