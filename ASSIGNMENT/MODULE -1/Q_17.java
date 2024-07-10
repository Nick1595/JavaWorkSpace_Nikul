package assignmentJava_coreJava;

public class Q_17 {

public static void main(String[] args) {
		
		
		        String str1 = "Red is favorite color.";
		        String prefix1 = "Red";
		        System.out.println("\"" + str1 + "\" starts with \"" + prefix1 + "\"? " + startsWith(str1, prefix1));

		        String str2 = "Orange is also my favorite color.";
		        String prefix2 = "Red";
		        System.out.println("\"" + str2 + "\" starts with \"" + prefix2 + "\"? " + startsWith(str2, prefix2));
		    }

		   
		    public static boolean startsWith(String str, String prefix) {
		        return str.startsWith(prefix);
		    }
	

	}

