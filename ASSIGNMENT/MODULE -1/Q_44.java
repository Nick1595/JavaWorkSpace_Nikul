package assignmentJava_coreJava;

//Class implementing Runnable for thread 1
class Thread1 implements Runnable {

 @Override
 public void run() {
     try {
         System.out.println("Thread 1 started");
         Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
         System.out.println("Thread 1 ended");
     } catch (InterruptedException e) {
         System.out.println("Thread 1 interrupted");
     }
 }
}

//Class extending Thread for thread 2
class Thread2 extends Thread {

 @Override
 public void run() {
     try {
         System.out.println("Thread 2 started");
         Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
         System.out.println("Thread 2 ended");
     } catch (InterruptedException e) {
         System.out.println("Thread 2 interrupted");
     }
 }
}

public class Q_44{
 public static void main(String[] args) {
     // Creating instances of threads
     Thread thread1 = new Thread(new Thread1());
     Thread thread2 = new Thread2();

     // Starting both threads
     thread1.start();
     thread2.start();

     // Main thread continues execution
     System.out.println("Main thread continuing execution");

     // Joining threads (optional - to wait for threads to complete)
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted while waiting for threads to join");
     }

     // Main thread completes
     System.out.println("Main thread completed");
 }
}
