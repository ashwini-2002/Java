package FileHandling;
import java.io.File;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("Tech.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

