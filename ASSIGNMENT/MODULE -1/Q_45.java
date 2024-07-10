package assignmentJava_coreJava;

//Class extending Thread
class TestThreadTwice1 extends Thread {

 @Override
 public void run() {
     System.out.println("Thread running: " + Thread.currentThread().getName());
 }
}

public class Q_45 {
 public static void main(String[] args) {
     TestThreadTwice1 t1 = new TestThreadTwice1();

     t1.start();

     t1.start();
 }
}

