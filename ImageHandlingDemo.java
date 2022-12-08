package advanceJava;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandlingDemo {
    public static void main(String[] args) {
        int width = 963;
        int height = 640;

        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);
    }
    private static BufferedImage readFromFile(int width, int height, BufferedImage image){
        try {
            //locate the image file
            File sampleFile = new File("C:\\Users\\iante\\Java Project\\Cute.jpg");

            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            //Reading input file and convert to bytecode
            image = ImageIO.read(sampleFile);

            System.out.println("Reading is complete. " + image);
        } catch (IOException e) {
            System.out.println(e);
        }
        return image;
    }
    private static void writeToFile(BufferedImage image){
        try {
            //write image to this location
            File output = new File("C:\\Users\\iante\\Java Project\\ImageLocation\\output.jpg");

            //writing image file
            ImageIO.write(image, "jpg", output);

            System.out.println("Writing is complete. ");
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
