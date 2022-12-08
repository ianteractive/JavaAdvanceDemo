package advanceJava;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "New World";
        //show string length
        System.out.println(str1.length());

        //concat
        String concat1 = str1.concat(str2);
        System.out.println(concat1);

        //%s substitute string, %d substitute integer
        String r = String.format("The name of student" + "%s, and the is " + "variable is %d", "John", 21);
        System.out.println(r);

        //find the location of character in array of String
        System.out.println(str1.charAt(6));

        //boolean check if str1 equals to str2
        if (str1.equals(str2)){
            System.out.println("Both string are same");
        } else {
            System.out.println("Both string are different");
        }
        //reverse location
        System.out.println(str1.indexOf('o'));

        //replace char
        System.out.println(str1.replace('W', 'B'));

        //Separate strings whenever it meets the separator
        //break the string into substring
        String[] arr = str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        //Get and separate a certain substring base on (1st index, end index)
        String newStr = str1.substring(1,5);
        System.out.println(newStr);

    }
}
