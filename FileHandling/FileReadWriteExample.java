package FileHandling;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        try {
            // Writing
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tech.txt"));
            bw.write("Hello Java");
            bw.newLine();
            bw.write("File Handling Example");
            bw.close();

            // Reading
            BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

