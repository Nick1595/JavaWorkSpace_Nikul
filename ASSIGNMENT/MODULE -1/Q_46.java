package assignmentJava_coreJava;

//Class extending Thread
class TestDaemonThread2 extends Thread {

 @Override
 public void run() {

	 System.out.println("Thread " + Thread.currentThread().getName() + " is daemon: " + isDaemon());

     // Simulating some task (printing numbers 1 to 5)
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + ": " + i);
         try {
             Thread.sleep(1000); // Sleep for 1 second
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }
}

public class Q_46 {
 public static void main(String[] args) {
     TestDaemonThread2 t1 = new TestDaemonThread2();
     TestDaemonThread2 t2 = new TestDaemonThread2();

     // Start both threads
     t1.start();

     // Set t2 as daemon thread and start it
     t2.setDaemon(true);
     t2.start();

     // Main thread continues execution
     System.out.println("Main thread completed");
 }
}
