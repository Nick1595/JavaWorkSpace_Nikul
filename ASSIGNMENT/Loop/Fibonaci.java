package Loop;

public class Fibonaci {
	public static void main(String[] args) {
       int i;
       int n =10;
       int First = 0;
       int Second =1;
       int Third;
       
       for (i=1;i<n; i++) {
    	   System.out.println(First);
    	   Third=First+Second;
    	   First=Second;
    	   Second=Third;
    	   
       }
    }
}
