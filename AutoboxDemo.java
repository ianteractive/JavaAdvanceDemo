package advanceJava;

public class AutoboxDemo {
    public static void main(String[] args) {
        int i = 10;

        //Autoboxing
        Integer iObj = Integer.valueOf(i);
        System.out.println("The value of Integer is " + iObj);
        Character iChar = Character.valueOf('a');
        System.out.println("The value of Character is " + iChar);

        //auto unbox
        int i1 = iObj;
        System.out.println("The value of int is " + i1);
        char c1 = iChar;
        System.out.println("The value of char is " + c1);

    }
}
