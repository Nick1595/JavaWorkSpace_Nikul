package assignmentJava_coreJava;

import java.util.HashMap;
import java.util.Map;

public class Q_60 {

	public static void main(String[] args) {
      
        Map<Integer, String> map = new HashMap<>();

      
        map.put(1, "NIK");
        map.put(2, "VICKY");
        map.put(3, "ROBIIN HOOD");

       
        int size = map.size();

        
        System.out.println("Number of key-value mappings in the HashMap: " + size);
    }

}
