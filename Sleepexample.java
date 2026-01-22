package Ashwini;

public class Sleepexample extends Thread {
public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

public static void main(String[] args)
{
	 Sleepexample t1=new  Sleepexample();
	 Sleepexample t2=new  Sleepexample();
	
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
	 
	 t1.start(); // start thread
     t2.start(); // start thread        
     // op:(The exact order may vary because thread scheduling is handled by the JVM.)

 
}
 
}