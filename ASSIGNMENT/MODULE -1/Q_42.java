package assignmentJava_coreJava;

class MyRunnable implements Runnable {

    @Override
    public void run() {

    	for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(2500); // Sleep for 2.5 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}


public class Q_42 {

	  public static void main(String[] args) {
	        MyRunnable myRunnable = new MyRunnable();

	        Thread thread = new Thread(myRunnable);

	        // Starting the thread
	        thread.start();

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
