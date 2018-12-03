import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// bitmap class converts a file to a buffered image
// bitmap instance methods manipulate pixel order and either
// mirror or reverse the specified image over the either the horizontal or vertical axis
// saves the bitmap to a new BMP file according to command line input.
public class Bitmap {
    public BufferedImage img;
    public String savePath;
    public String transform;


    // constructs a new bitmap instance
    public Bitmap(String path, String savePath, String transform){

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
        this.transform = transform;

        this.transformAndSave();

    }

    // instance reflects pixels of bitmap image over vertical midline
    public void mirrorOverVerticalMidline(){

        for(int i = 0; i < this.img.getHeight(); i++){
            for(int j = 0; j < this.img.getWidth() / 2; j++){

                int tempVal = this.img.getRGB(i, this.img.getWidth()-1-j);

                this.img.setRGB(i,this.img.getWidth()-1, this.img.getRGB(i,j));

                this.img.setRGB(i, j, tempVal);
            }
        }
    }

    // instance reflects pixels of bitmap image over horizontal midline
    public void mirrorOverHorizontalMidline(){

        for(int i = 0; i < this.img.getHeight(); i++){
            for(int j = 0; j < this.img.getWidth() / 2; j++){
                int tempVal = this.img.getRGB(this.img.getWidth()-1-j, i);

                this.img.setRGB(this.img.getWidth()-1, i, this.img.getRGB(i,j));

                this.img.setRGB(j, i, tempVal);
            }
        }
    }


    // reverses image in horizontal direction
    public void flipHorizontally(){

            for(int i = 0; i < this.img.getHeight(); i++){
                for(int j = 0; j < this.img.getWidth() / 2; j++){
                    int tempVal = this.img.getRGB(this.img.getWidth()-1-j, i);

                    this.img.setRGB(this.img.getWidth()-1-j, i, this.img.getRGB(j,i));

                    this.img.setRGB(j, i, tempVal);
                }
            }
        }

    // reverses image in vertical direction
    public void flipVertically(){

        for(int i = 0; i < this.img.getWidth(); i++){
            for(int j = 0; j < this.img.getHeight() / 2; j++){

                int tempVal = this.img.getRGB(i, this.img.getHeight()-1-j);

                this.img.setRGB(i, this.img.getHeight()-1-j, this.img.getRGB(i,j));

                this.img.setRGB(i, j, tempVal);
            }
        }
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

    // depending on the transform sent in via the command line, run the correct transform, then save
    // if transform is legitimate
    public void transformAndSave(){

        if (this.transform.equals("mirrorOverHorizontalMidline")){
            this.mirrorOverHorizontalMidline();
            this.save();

        } else if (this.transform.equals("mirrorOverVerticalMidline")) {
            this.mirrorOverVerticalMidline();
            this.save();

        } else if (this.transform.equals("flipHorizontally")) {
            this.flipHorizontally();
            this.save();

        } else if (this.transform.equals("flipVertically")) {
            this.flipVertically();
            this.save();

            // if transform doesn't match any in our code bank, send back a println message
        } else {
            System.out.println("Sorry, unable to perform transform");
        }
    }
}
