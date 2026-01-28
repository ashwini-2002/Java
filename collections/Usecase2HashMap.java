//HashSet does NOT allow duplicates
package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // check duplicate based on patient ID
    @Override                                      // We use @Override because we are redefining methods that already exist in Object class.
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Patient patient = (Patient) obj;
        return id == patient.id;
    }

    // generate hash based on patient ID
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name;
    }
}

public class Usecase2HashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Patient> patients = new HashSet<>();

        System.out.print("Enter number of patients to add: ");
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Patient Name: ");
            String name = sc.next();
 
            //Names can be same ,ID is unique
            Patient p = new Patient(id, name);

            if (patients.add(p)) {
                System.out.println("Patient successfully registered");
            } else {
                System.out.println("Patient already registered (Duplicate ID)");
            }
        }

        System.out.println("\nList of Unique Registered Patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }

        sc.close();
    }
}
