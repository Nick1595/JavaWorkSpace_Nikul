package assignmentJava_coreJava;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Q_11 {
	public static void main(String[] args) {
		   // Create a SimpleDateFormat object
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        // Get the current system time
        Date currentDate = new Date(7);

        // Format the current time
        String formattedTime = formatter.format(currentDate);

        // Display the current time
        System.out.println("Current system time: " + formattedTime);
    
		
	}
}
