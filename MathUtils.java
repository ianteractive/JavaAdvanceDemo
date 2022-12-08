package advanceJava;

public class MathUtils {

    //supply int and give multiples up to times 5
    //sync : 1 thread at a time
    synchronized void getMultiples(int n){
        //synchronize (this) : sync a particular block of code
        for (int i = 1;i<=5; i++){
            System.out.println(n * i);
            try {
                //Pause execution thread to 400 millisecond
                Thread.sleep(400);
            } catch (Exception e){
                System.out.println("Exception is"+e);
            }
        }
    }
}
