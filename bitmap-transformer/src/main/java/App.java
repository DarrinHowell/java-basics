import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/*
 * CLI App reads in file path, desired output file path, and bitmap image transform
 * CLI App transforms bitmap image if valid bitmap image and valid transform coincides with
 * computations in Bitmap constructor codebase.
 * If provided transform does not match anything in the code base, an error message is output.
 */
public class App {

    public static void main(String[] args){

        // rename args (readability)
        String filePath = args[0];
        String outputPath = args[1];
        String transform = args[2];

        // create Bitmap instance, run a transform or print an error message, save the file
        Bitmap myBitmap = new Bitmap(filePath, outputPath, transform);

    }



}
