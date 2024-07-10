package assignmentJava_coreJava;

abstract class Marks {
    // Abstract method
    abstract double getPercentage();
}

class A extends Marks {
    private int marks1;
    private int marks2;
    private int marks3;

    public A(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    double getPercentage() {
        int totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 3.0);
    }
}

class B extends Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;

    public B(int marks1, int marks2, int marks3, int marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    double getPercentage() {
        int totalMarks = marks1 + marks2 + marks3 + marks4;
        return (totalMarks / 4.0);
    }
}

public class Q_30 {
    public static void main(String[] args) {

    	Marks studentA = new A(90, 74, 70);
        Marks studentB = new B(75, 65, 50, 85);

        System.out.println("Percentage  marks of student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage  marks of student B: " + studentB.getPercentage() + "%");
    }
}
