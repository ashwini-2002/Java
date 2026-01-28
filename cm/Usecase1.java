//Assignment 1


//Use Case 1: Weather Data Analyzer
//📝 Problem Statement
//Build a simple Java console program named WeatherAnalyzer.java that:
//Accepts 2 command-line arguments:
//City Name (String)
//Temperature (float)
//Example command:
//java WeatherAnalyzer Hyderabad 32.5
//  2. Inside the program:
//Create variables of different datatypes:
//
//float temp, boolean isHot, int threshold, String city
//Use operators to determine weather condition:
//If temperature > 30 → "Hot Day"
//Else → "Normal Day"
//Use keywords like if, else, class, public, static, final, new
//3. Create a temporary WeatherRecord object, then set it to null and explain how Garbage Collection     will eventually remove it.
//Print the output:
//City: Hyderabad
//Temperature: 32.5°C
//Condition: Hot Day



//for my understanding

//If temperature > 30 → "Hot Day"
//Else → "Normal Day"

//float temp=(float) 32.5;
//if(temp > 30 ) {
//	System.out.println("Hot Day");
//}
//else {
//	System.out.println("Normal Day");
//
//}



//my code
package ashwini.cm;
import java.util.Scanner;
public class Usecase1 {
	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter city name: ");
      String city = sc.nextLine();

      System.out.print("Enter temperature: ");
      float temp = sc.nextFloat();

      if (temp > 30) {
          System.out.println("City: " + city);
          System.out.println("Temperature: " + temp + "°C");
          System.out.println("Condition: Hot Day");
      } else {
          System.out.println("City: " + city);
          System.out.println("Temperature: " + temp + "°C");
          System.out.println("Condition: Normal Day");
      }

      sc.close();

}
}




//package ashwini.cm;
//class WeatherRecord
//{
//String city;
//float temperature;
//}
//public class Usecase1 {
//	public static void main(String[] args) {
//		
//		String city=args[0];
//		float temp=Float.parseFloat(args[1]);  
//		 
//		final int threshold=30;
//		boolean isHot;
//		 
//		if(temp>threshold)
//		{
//			isHot=true;
//		}
//		else
//		{
//			isHot=false;
//		}
//		System.out.println("City: "+city);
//		System.out.println("Temperature: " +temp + "c" );
//		 
//		if(isHot)
//		{
//			System.out.println("Condition: Hot Day");
//		}
//		else
//		{
//			System.out.print("Condition: Normal Day");
//		}
//		WeatherRecord record=new WeatherRecord();
//		record.city=city;
//		record.temperature=temp;
//		record=null;
//		}	
//}
//
//
//
//
//

//with constructor

//class WeatherRecord
//{
//String city;
//float temperature;
//WeatherRecord(String city,float temperature)
//{
//this.city=city;
//this.temperature=temperature;
//}
//}
//public class WeatherAnalyzer
//{
//public static void main(String[] args)
//{
//String city=args[0];
//float temp=Float.parseFloat(args[1]);   
// 
//final int threshold=30;
//boolean isHot;
// 
//if(temp>threshold)
//{
//	isHot=true;
//}
//else
//{
//	isHot=false;
//}
//System.out.println("City: "+city);
//System.out.println("Temperature: " +temp + "c" );
// 
//if(isHot)
//{
//	System.out.println("Condition: Hot Day");
//}
//else
//{
//	System.out.print("Condition: Normal Day");
//}
//WeatherRecord record=new WeatherRecord(city, temp);
//record=null;
//}
//}
 
 











