class DisplayBMS implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.out.println("BMS Thread Interrupted");
        }
    }
}

class DisplayCSE implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("CSE");
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            System.out.println("CSE Thread Interrupted");
        }
    }
}

public class CollegeThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DisplayBMS());
        Thread thread2 = new Thread(new DisplayCSE());

        thread1.start();
        thread2.start();
        
        try {
 
            Thread.sleep(20000);  

            thread1.interrupt();
            thread2.interrupt();
            
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Both the threads have stopped")
    }
}
