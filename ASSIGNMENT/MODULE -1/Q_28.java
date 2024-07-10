package assignmentJava_coreJava;

abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println(" second subclass");
    }
}

public class Q_28 {
    public static void main(String[] args) {
        Parent first = new FirstSubclass();
        first.message();

        Parent second = new SecondSubclass();
        second.message();
    }
}
