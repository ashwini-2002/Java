package ashwini.cm;

public class Assignment3 {

	public static void main(String[] args) {
		
		String[] employees = {
	            "Renu Sai",
	            "Akhil Kumar",
	            "John Doe",
	            "Meera"
	        };
        for (int i = 0; i < employees.length; i++) {

            String name = employees[i];
            System.out.println("Employee: " + name);
            if (name.length() > 10) {
                System.out.println("Long Name");
            } 
            else if (!name.contains(" ")) {
                System.out.println("Single Word Name");
            } 
            else {
                System.out.println("Normal Name");
            }
      
         System.out.println("UPPER: " +name.toUpperCase());
   		 StringBuffer rev= new StringBuffer(name);
   		 System.out.println("REVERSE: " +rev.reverse());
   		 StringBuilder app= new StringBuilder(name);
   		 System.out.println("APPENDED: " +app.append("-verified"));
        }
    }
}

	
	






