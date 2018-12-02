import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    public BufferedImage img;
    public String savePath;


    public Bitmap(String path, String savePath){

        // create a file that Java can manipulate
        BufferedImage bitFile = null;
        try {
            bitFile = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println(e);
        }

        // set it as a field of Bitmap
        this.img = bitFile;
        this.savePath = savePath;

    }

    // instance method which writes this bitmap data to a new file
    // file location will be in the same directory as the file we received from disk
    public void save(){
        // take buffered img from this specific instance and write it to a file
        // specified by the client
        try{
            ImageIO.write(this.img, "BMP", new File(this.savePath));
        } catch(IOException e) {
            System.out.println(e);
        }


    }
}
