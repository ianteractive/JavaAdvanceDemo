package advanceJava;

public class Thread2 implements Runnable{
    //Multithreading instead of extends Class1 extends Thread
    @Override
    public void run() {
        try{
            System.out.println("Thread2 is running");
        } catch (Exception e) {
            System.out.println("Exception is" + e);
        }
    }
}
