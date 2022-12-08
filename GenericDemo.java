package advanceJava;

public class GenericDemo<T> {
    T obj;

    GenericDemo(T obj){
        this.obj = obj;
    }
    public T getObj() {
        return this.obj;
    }

    public static void main(String[] args) {
        GenericDemo<Integer> tObj = new GenericDemo<>(1);
        System.out.println(tObj.getObj());

        GenericDemo<String> sObj = new GenericDemo<>("Hello World");
        System.out.println(sObj.getObj());
    }
}
