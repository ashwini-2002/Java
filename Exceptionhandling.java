//Try catch eXample 

//ArithmeticException

package Ashwini;

public class Exceptionhandling {

	/*public static void main(String[] args)
	{
	 
	try {
			int a=10;
			int b=0;
			int result=a/b;
			System.out.println(result);
		}
		 catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
	System.out.println("Program continue...");
	}
	}
*/	 


	
	
	//ArrayIndexOutOfBoundsException 
	
	//multiple catch blocks 
	

	/*public static void main(String[] args)
	{
	try {
		int arr[]= {10, 20, 30};
		
		System.out.println(arr[5]);
		
	}
	 
		catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of bond exception");
	}
	catch (Exception e)
	{
			System.out.println("Generic Exception");   //generic exception : all possible exception it will handle 
	}
	}
	} */
	
	//in try block only one exception will check even if we are having multiple errors also //solution is throws keyword
	/*public static void main(String[] args)
	{
	try
	{
		int arr[]=new int[3];
		arr[4]=10;
		
		int a=5/0;
	 
	}
	catch(Exception e)
	{
		System.out.println(" Exception handle:" + e);
	}
	}
	
	*/
	
	
	
	//nested exception then it will check with two errors also
	

	/*public static void main(String[] args)
	{
	try {
		try													
		{
			int a=10/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Inner catch: Divide by zero");
		}
		int arr[]= {1, 2, 3};
		System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Outer Catch : Array index error");
	}
	}
	*/
	 
	
	
	}
	 
	
	 