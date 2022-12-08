package advanceJava;

public class DualGenericHolder<E, T> {
    E obj1;
    T obj2;

    DualGenericHolder(E obj1, T obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void printObj(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        DualGenericHolder<Integer, String> dualObject = new DualGenericHolder<Integer, String>(1, "Hello World");
        dualObject.printObj();
    }

}
