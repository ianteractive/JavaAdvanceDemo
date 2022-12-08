package advanceJava;

import java.io.*;

public class serializationT {
    public static void main(String[] args) {

        Student student = new Student("John", 25, "23 East, California");
        student.setX(10);

        String filename = "C:\\Users\\iante\\Java Project\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        //serialize the object : Write the object to the file to the local directory (local/network)
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n" + student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //deserialize the object
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);
            //cast (Student) is important to know or give information to the system that it is an object student
            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deserialized: \n" + object);
            System.out.println("The deserialized value of x is " + object.getX());
            objIn.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
