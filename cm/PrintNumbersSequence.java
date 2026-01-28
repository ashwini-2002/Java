//Print Numbers in Sequence with Multiple Threads

/*Implement a program that uses three separate threads to print numbers in sequence up to a given integer n. The program should initialize three threads and ensures that they print the numbers in sequence without any overlaps. The user provides the value of n, and the program should print the numbers in the sequence.

Function Description:

In the provided code snippet, complete the implementation of PrintNumbersInSequence constructor to ensure sequential printing of numbers. You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”.

There will be multiple test cases running so the Input and Output should match exactly as provided.

Input Format:

The program expects a single integer n as input, denoting the maximum value for the sequence.

Output Format:

The program outputs a single line containing the space-separated numbers from 1 to n printed in sequence.

Constraints:

The input integer n is a positive integer.

Sample Input:

10

Sample Output:

1 2 3 4 5 6 7 8 9 10

Explanation:

The program takes the user input 10 and initializes three threads to print numbers in sequence. Each thread prints a portion of the sequence, ensuring that the numbers are printed in the correct order without overlaps. The program prints the sequence 1 2 3 4 5 6 7 8 9 10.

*/
package ashwini.cm;
import java.util.Scanner;
public class  PrintNumbersSequence {
	
private int n;
private int number=1;
private final Object lock=new Object();
	
public  PrintNumbersSequence(int n)
	{
		this.n=n;
		
		Runnable task=()->{
			while(true)
			{
				synchronized(lock)
				{
					if(number >n)
					{
						lock.notifyAll();
						break;
}
					System.out.println(number + " ");
					number++;
					lock.notifyAll();
					try
					{
						lock.wait();
					}
						catch(InterruptedException e)
					{
						Thread.currentThread().interrupt();
					}
					}
					}
};
Thread t1=new Thread(task);
Thread t2=new Thread(task);
Thread t3=new Thread(task);
 
t1.start();
t2.start();
t3.start();
 
try
{
	t1.join();
	t2.join();
	t3.join();
}
catch(InterruptedException e)
{
	Thread.currentThread().interrupt();
}
}
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
new  PrintNumbersSequence(n);
sc.close();
}
}
 
 