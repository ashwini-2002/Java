package collections;

import java.util.LinkedList;

public class UseCase1LinkedList {

    public static void main(String[] args) {

        // Creating LinkedList of patients
        LinkedList<String> patients = new LinkedList<>();

        // Adding patients
        patients.add("Sai");
        patients.add("Krishna");
        patients.add("Deva");

        // Emergency patient added at first position
        patients.addFirst("Emergency-Suresh");

        // Adding patient at last position
        patients.addLast("Pooja");

        // Display full list
        System.out.println("Patient List: " + patients);

        // Get first patient
        System.out.println("First Patient: " + patients.getFirst());

        // Get last patient
        System.out.println("Last Patient: " + patients.getLast());

        // Check if patient exists
        System.out.println("Is Pooja present? " + patients.contains("Pooja"));

        // Find position (index)
        System.out.println("Position of Deva: " + patients.indexOf("Deva"));

        // Remove first patient (treated)
        System.out.println("Treated Patient: " + patients.removeFirst());   //it will remove output will not display here

        // Remove specific patient
        patients.remove("Pooja");          //it will just remove

        // Try removing a non-existing patient
        //System.out.println("Removed Sai? " + patients.remove("Sai"));   //it will check sai is removed or not    it return boolean value

        // Remaining patients count
        System.out.println("Total Remaining Patients: " + patients.size());

        // Display updated list
        System.out.println("Updated Patient List:");
        for (String patient : patients) {
            System.out.println(patient);
        }
    }
}
