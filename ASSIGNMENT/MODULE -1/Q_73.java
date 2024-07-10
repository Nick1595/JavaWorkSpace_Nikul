package assignmentJava_coreJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q_73 {

	public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        
        map.put(1, "NIKUL");
        map.put(2, "JAY");
        map.put(3, "DARSH");
        map.put(4, "NEEL");

      
        Collection<String> values = map.values();

     
        System.out.println("Collection view of values in the map:");
        for (String value : values) {
            System.out.println(value);
        }
    }
}
