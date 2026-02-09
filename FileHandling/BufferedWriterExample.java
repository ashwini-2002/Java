package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tech.txt"));
            bw.write("Hello Java");
            bw.newLine();
            bw.write("Welcome to File Handling");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//BufferedWriter writes data efficiently using buffer memory.
/*

What it does

Writes data using a buffer → faster than FileWriter

*/