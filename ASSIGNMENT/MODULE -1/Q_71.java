package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_71 {

	   public static void main(String[] args) {
	    
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("scooter");
	        colors.add("bike");
	        colors.add("car");
	        colors.add("bus");
	        colors.add("truck");

	
	        System.out.println("Elements of ArrayList with their positions:");
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Position " + i + ": " + colors.get(i));
	        }
	    }
}
