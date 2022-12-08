package advanceJava;

public class Thread3 extends Thread {
    MathUtils mu;
    public Thread3(MathUtils mu) {
        this.mu = mu;
    }
    //run always
    public void run(){
        try {
            mu.getMultiples(2);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
