package ashwini.cm;

import java.util.Scanner;

public class Usecase8AtmScenerio {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int orgPin = 1234;
				
			try {		
				System.out.println("Enter your Pin :");
				int pin = sc.nextInt();
			  if(pin == orgPin) {		  
				  System.out.println("Pin Got Matched ");
				  
			  }else {
				  throw new Exception("try with correct pin");		  
			  }
			}catch(Exception e) {
				System.out.println("Wrong Input  Please try Again" + e.getMessage());
				
				sc.next();
			}
			finally{
				System.out.println("Logged Completed");
			}
		}
	}
	 
 
 


//without throw keyword
/*package ashwini.cm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usecase8AtmScenerio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int orgPin = 1234;

        while (true) {
            try {
                System.out.println("Enter your Pin :");
                int pin = sc.nextInt();

                if (pin == orgPin) {
                    System.out.println("Pin Got Matched");
                    break;
                } else {
                    System.out.println("Wrong Pin");
                }

            } catch (InputMismatchException e) {
                System.out.println("Wrong Input. Please try again");
                sc.next(); // clear invalid input :if string we are giving 
            } finally {
                System.out.println("Login Completed");
            }
        }
        sc.close();
    }
}
*/





