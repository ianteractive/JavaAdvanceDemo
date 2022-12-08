package advanceJava;

public class Thread1 extends Thread {
    //Single Thread use
    @Override
    public void run(){
        try {
            System.out.println("Thread1 is running: ");
        }
        catch (Exception e){
            System.out.println("Thread1 exception" + e);
        }
    }
}
