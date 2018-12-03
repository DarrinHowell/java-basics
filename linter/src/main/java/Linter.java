import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Linter {
    public static void main(String[] args){
        Path jsPath = FileSystems.getDefault().getPath("resources", "gates.js");

        alertSemicolons(jsPath);
    }

    // method prints an error message when a semicolon is not terminating a line when it should be
    // method takes in a path and reads in a javascript file
    public static void alertSemicolons(Path jsPath){

        try {

            BufferedReader reader = Files.newBufferedReader(jsPath);
            String newLine;

            int lineNum = 0;

            // while we haven't reached the end of the file, read the file
            while((newLine = reader.readLine()) != null){
                lineNum++;

                // if the line is not empty, do some work to check if ; are in the right places
                if(newLine.length() > 0) {
                    char lastChar = newLine.charAt(newLine.length()-1);

                    // if semicolons are not present where they should be, print an error
                    if(lastChar != ';' && lastChar != '{' && lastChar != '}' && !newLine.contains("if") &&
                        !newLine.contains("else")){

                        System.out.println("Line " + lineNum + ": Missing semicolon.");

                    }
                }
            }

        // if we don't properly read a file, print out an error message
        } catch (IOException e) {

            System.out.println(e);
        }
    }
}
