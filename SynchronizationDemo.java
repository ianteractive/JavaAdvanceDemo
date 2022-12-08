package advanceJava;

public class SynchronizationDemo {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();

        Thread3 t3 = new Thread3(obj);
        Thread t4 = new Thread(new Thread4(obj));
        t3.start();
        t4.start();
    }
}
