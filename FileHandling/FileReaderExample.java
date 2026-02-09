package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Tech.txt");
            int ch;
            while ((ch = fr.read()) != -1) {                      //fr.read() returns the character’s integer value.,,,Returns -1 when the end of the file is reached.
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//FileReader is used to read text data from a file character by character.
/*

What it does

Reads file character by character

*/
