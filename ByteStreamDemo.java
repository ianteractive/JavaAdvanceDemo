package advanceJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outputStream = null;

        try {
            inStream = new FileInputStream("C:\\Users\\iante\\Java Project\\source.txt");
            outputStream = new FileOutputStream("C:\\Users\\iante\\Java Project\\decode.txt");

            //read a byte at a time, if it reached end of the file, returns -1
            int content;
            while ((content = inStream.read()) != -1){
                outputStream.write((byte) content);
            }
        } finally {
            if(inStream != null){
                inStream.close();
            }
            if(outputStream != null){
                outputStream.close();
            }
        }
    }

}
