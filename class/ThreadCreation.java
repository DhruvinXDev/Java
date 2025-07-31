public class ThreadCreation extends Thread
{

    public ThreadCreation(String tname) {
        super(tname);
    }
    
    public void run ()
    {
        try{
            System.out.println("" + Thread.currentThread().getName() + " is running");
            Thread.sleep(1000);
            System.out.println("" + Thread.currentThread().getState() + " after sleep");

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("In run method Thread name is : "+ Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        ThreadCreation myThread = new ThreadCreation("dhruvin");
        System.out.println(myThread);
        myThread.setName("Hello Dhruvin");
        myThread.start();
        // Thread thread = new Thread(myThread);
        // System.out.println(thread);
        // thread.start();
        System.out.println(Thread.currentThread().getName() + " Current in " + myThread.getState());
    }
}