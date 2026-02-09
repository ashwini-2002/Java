package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Seralisation implements Serializable
{
    int id;
    String name;
    double marks;

    Seralisation(int id, String name, double marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            //SERIALIZATION 
            Seralisation l1 = new Seralisation(id, name, marks);

            FileOutputStream fos = new FileOutputStream("Learner.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(l1);

            oos.close();
            fos.close();

            System.out.println("\nObject Serialized Successfully\n");

            // DESERIALIZATION 
            FileInputStream fis = new FileInputStream("Learner.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Seralisation l2 = (Seralisation) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Deserialized Object Data:");
            l2.display();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
