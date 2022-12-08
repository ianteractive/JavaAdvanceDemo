package advanceJava;

public class ThreadDemo {
    public static void main(String[] args) {

        int n = 10;
        for (int x = 0; x < n; x++){
            //initialize the class to run thread
            Thread1 t1 = new Thread1();
            t1.start();
            //initialize thread2 this syntax:
            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}
