package collections;
import java.util.*;
public class ComporatorExample {
	
	public static void main(String[] args)
//	{
//	TreeMap<Integer, String>Employee=new TreeMap<>(Comparator.reverseOrder());
//	Employee.put(101, " Vinay ");
//	Employee.put(102, " Sonali ");
//	Employee.put(103, " Renu ");
//	Employee.put(104, " Sai ");
//			
//	System.out.println(Employee);
//	}
	
	
	{
		TreeMap<Integer, String>Employee=new TreeMap<>(Comparator.naturalOrder());
		Employee.put(101, " Vinay ");
		Employee.put(102, " Sonali ");
		Employee.put(103, " Renu ");
		Employee.put(104, " Sai ");
				
		System.out.println(Employee);
				
		 
		}
	}
	 
	
