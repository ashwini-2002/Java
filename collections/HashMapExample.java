package collections;
import java.util.*;
import java.util.Map;
public class HashMapExample {

public static void main(String[] args)
{
//Map<Integer, String>Employee = new HashMap<>();
//HashMap<Integer, String>Employee1= new HashMap<>();
HashMap<Integer, String>Employee = new HashMap();
 
		Employee.put(101, "Ashi");   
		Employee.put(102, "Ani");
		Employee.put(103, "Mini ");
		
		System.out.println(Employee);
		
		System.out.println(Employee.get(102));  
		
		Employee.remove(103);
		System.out.println(Employee);
		
		System.out.println("Size: " + Employee.size());

		System.out.println("Keys: " + Employee.keySet());

		System.out.println("Values: " + Employee.values());

		System.out.println(Employee.isEmpty());
		
		System.out.println("Contain Key 101?: " + Employee.containsKey(101));
		
		System.out.println("Contain value Ashi?: " + Employee.containsValue("Ashi"));

		Employee.replace(102, "Anitha");
		System.out.println(Employee);


		Employee.clear();
		System.out.println(Employee);

		
		

		

	}
}
 
 