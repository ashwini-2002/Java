package ashwini.cm;
import java.util.*;
public class OnlineExamScoringSystem11 {

	public static void main(String[] args) {

        // Store subject scores (int -> Integer)

		Map<String, Integer> scores =new HashMap<>();
		
        // Autoboxing: int -> Integer

		scores.put("Maths",95);
		scores.put("English",97);
		scores.put("Kannada",92);
		scores.put("science", 85);
		scores.put("social", 88);

        System.out.println("Students Exam Scores:");
           
        
        //Reading Data from Map (Unboxing)
        int total = 0;
        
        // Unboxing: Integer -> int (unboxing for avg score calculations)
        
        for (Map.Entry<String, Integer> entry :scores.entrySet()) {
        System.out.println(entry.getKey()+ " : " +entry.getValue());
        total += entry.getValue();   //unboxing happens here 
        }
        
        //calculate average score 
        
        double average = total / (double) scores.size();
        
        System.out.println("\nTotal score:" + total);
        System.out.println("Average score:" +average);

	}

}
