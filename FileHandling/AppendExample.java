package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Tech.txt", true); // true = append
            fw.write("\nNew line added");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*
Example: Append using BufferedWriter
BufferedWriter bw = new BufferedWriter(new FileWriter("Tech.txt", true));
bw.write("Appended text");
bw.newLine();
bw.close();
*/

//Append is used to add data at the end of a file without removing existing data.

//Append allows writing data at the end of the file instead of overwriting it.

//| Mode                | Result           |
//| ------------------- | ---------------- |
//| Append (`true`)     | Adds data        |
//| Overwrite (`false`) | Deletes old data |
