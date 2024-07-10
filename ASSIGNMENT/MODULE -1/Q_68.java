package assignmentJava_coreJava;

import java.util.HashMap;
import java.util.Map;

public class Q_68 {

	
	 public static void main(String[] args) {
	     
	        Map<String, Integer> map = new HashMap<>();

	        map.put("John", 25);
	        map.put("Jane", 30);
	        map.put("Doe", 28);

	  
	        if (map.isEmpty()) {
	            System.out.println("Map is empty.");
	        } else {
	            System.out.println("Map is not empty.");
	        }

	
	        map.clear();

	      
	        if (map.isEmpty()) {
	            System.out.println("Map is empty.");
	        } else {
	            System.out.println("Map is not empty.");
	        }
	    }
}
