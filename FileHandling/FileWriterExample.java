package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Tech.txt");
            fw.write("Hello Java");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//FileWriter is used to write text data into a file.

//Writes characters directly into a file
/*
Output in file
Hello Java
*/