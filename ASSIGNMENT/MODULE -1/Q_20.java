package assignmentJava_coreJava;

public class Q_20 {

	
     public void printn(int number) {
        System.out.println("Integer: " + number);
    }

    public void printn(double number) {
        System.out.println("Double: " + number);
    }

    public void printn(float number) {
        System.out.println("Float: " + number);
    }

    public void printn(long number) {
        System.out.println("Long: " + number);
    }

    public void printn(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        Q_20 printer = new Q_20();

        // Testing of different data types
        printer.printn(123);
        printer.printn(123.45);
        printer.printn(123.45f);
        printer.printn(123456L);
        printer.printn("Hello EveyOne");
    }
}

