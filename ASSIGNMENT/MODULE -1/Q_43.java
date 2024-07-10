package assignmentJava_coreJava;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Q_43 {
    public static void main(String[] args) {

    	MyThread myThread = new MyThread();

        // Starting the thread
        myThread.start();

        // Main thread continues execution
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main thread executing: " + i);
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}