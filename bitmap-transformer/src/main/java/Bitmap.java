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

    public void mirrorOverHorizontalMidline(){

        for(int i = 0; i < this.img.getHeight(); i++){
            for(int j = 0; j < this.img.getWidth() / 2; j++){
                // grab val from the pixel at the end of the row, and store it in a var
                int tempVal = this.img.getRGB(i, this.img.getWidth()-1-j);

                // set the value at the end to be the value of the pixel that that we are currently at
                // in the for loop
                this.img.setRGB(i,this.img.getWidth()-1, this.img.getRGB(i,j));

                // set the value at the beginning to be the parallel value at the end of this row in the pixel array
                this.img.setRGB(i, j, tempVal);
            }
        }
    }


    public void mirrorOverVerticalMidline(){

        for(int i = 0; i < this.img.getHeight(); i++){
            for(int j = 0; j < this.img.getWidth() / 2; j++){
                int tempVal = this.img.getRGB(this.img.getWidth()-1-j, i);

                this.img.setRGB(this.img.getWidth()-1, i, this.img.getRGB(i,j));

                this.img.setRGB(j, i, tempVal);
            }
        }
    }



    public void flipHorizontally(){

            for(int i = 0; i < this.img.getHeight(); i++){
                for(int j = 0; j < this.img.getWidth() / 2; j++){
                    int tempVal = this.img.getRGB(this.img.getWidth()-1-j, i);

                    this.img.setRGB(this.img.getWidth()-1-j, i, this.img.getRGB(j,i));

                    this.img.setRGB(j, i, tempVal);
                }
            }
        }


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
}
