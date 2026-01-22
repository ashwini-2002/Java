//java 8 interface enhancements

//default method

//package Ashwini;
// 
//interface vehicle
//{
//	void start();
//	
//	default void fuelType()
//	{
//		System.out.println("Fueled");
//	}
//	
//}
//class carss implements vehicle{
//	public void start()
//	{
//		System.out.println();
//	}
//}
//public class fifthday {
//public static void main(String[] args)
//	{
// 
//	vehicle v=new carss();
//	v.start();
//	v.fuelType();
//	
//	}
//}


// static method

//package Ashwini;
// 
//interface calculator{
//	static void add (int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}
//public class fifthday {
// 
//	public static void main(String[] args)
//	{
//calculator.add(10, 20);
//	}
// 
//}



//introduction to lambda  expression

//package Ashwini;
//
//public class fifthday {
//
//	@FunctionalInterface   //Annotation
//	interface validator
//	{
//	boolean validator(String input);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//		 
//		@FunctionalInterface   //Annotation
//		interface validator
//		{
//		boolean validator(String input);
//		}
//		 
//	
//		validator emailCheck=email->email.contains("@");
//		 
//		System.out.println(emailCheck.validator("test@gmail.com"));
//		}
//		 
//		}
//		 
//	  


package Ashwini;
import java.util.Scanner;
 
public class Arraysort {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
 
        for (int i = 0; i < N; i++) {
       	System.out.println("Enter Number "+(i+1));
            A[i] = sc.nextInt();
        }
 
        sortArray(A, N);
 
        System.out.println("Sorted Array:");
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
 
        sc.close();
    }
 
    public static int[] sortArray(int[] A, int N) {
 
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
 
                int d1 = countDigits(A[j]);
                int d2 = countDigits(A[j + 1]);
 
                // Stable swap
                if (d1 > d2) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
 
    private static int countDigits(int num) {
        if (num == 0) return 1;
 
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
 

//input
//9 10 122 8 1290

//Output
//9 8 10 122 1290
 
