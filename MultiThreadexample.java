package Ashwini;

//public class MultiThreadexample extends Thread {
//	public void run()
//		{
//			System.out.println("Thread is running");
//		}
//	public static void main(String[] args)
//	{
//		MultiThreadexample t= new MultiThreadexample();
//	t.start();
//	}
//	}




 
//synchronized Only one thread at a time can execute this method on the same object (atm)

public class MultiThreadexample {
 
synchronized void withdraw(String Name)
{
System.out.println(Name + " is withdrawing money");
try
{
	Thread.sleep(2000);
}
catch(Exception e){}
 
System.out.println(Name + " Withdrawal completed");
}
	
public static void main(String[] args) {
 
	MultiThreadexample atm=new MultiThreadexample();
	
	new Thread(() -> atm.withdraw("User-1")).start();
	new Thread(() -> atm.withdraw("User-2")).start();
 
	}
 
}
 
 /*
(User-1 sleeps for 2 seconds)
User-1 Withdrawal completed
User-2 is withdrawing money
(User-2 sleeps for 2 seconds)
User-2 Withdrawal completed

*/