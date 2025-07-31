public class ThreadArray extends Thread
{
    public ThreadArray(String tname) {
        super(tname);
    }
    
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getState() + " after sleep");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("In run method Thread name is : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadArray[] threads = new ThreadArray[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadArray("Thread-" + i);
            threads[i].start();
        }
        
        for (ThreadArray thread : threads) {
            try {
                thread.join();
                System.out.println(thread.getName() + " has finished execution.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}