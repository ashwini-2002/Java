package collections;
import java.util.TreeMap;

public class Usecase3TreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> patients = new TreeMap<>();

        // Add patients
        patients.put(101, "Ashi");
        patients.put(102, "Ani");
        patients.put(103, "Kiki");

		System.out.println(patients);

        // Update patient -In TreeMap, keys are unique. If we use put() with an existing key, the old value is replaced with the new value.
        patients.put(102, "Mimi");
        patients.put(104, "Minu");
        patients.put(105, "Ashu");
		System.out.println(patients);


        // Retrieve patient  - view a patient’s details from the system using the Patient ID.
        System.out.println("Patient 105: " + patients.get(105)); 
	

        // List all patients
        System.out.println("All Patients:" + patients );
        //System.out.println(patients);


        // Check existence
        System.out.println("Contains Patient   103? " + patients.containsKey(103));
        System.out.println("Contains Patient  106? " + patients.containsKey(106));
        
        System.out.println("Contains Patient Ashi? " + patients.containsValue("Ashi"));

           

        // Count total  patients
        System.out.println("Total Patients: " + patients.size());


        // Remove patient
        patients.remove(106);
		System.out.println(patients);

       
        // Clear system
        patients.clear();

        System.out.println("System Cleared");
    }
}
