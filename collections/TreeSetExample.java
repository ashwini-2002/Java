package collections;
	import java.util.TreeSet;
	public class TreeSetExample {
	public static void main(String[] args)
		{
	TreeSet<String>cites=new TreeSet<>();
			
			try {
				
				cites.add("Delhi");
				cites.add("Mumbai");
				cites.add("Chennai");
				cites.add("Delhi");
				cites.add(null);	
			}
	catch(NullPointerException e)
			{
		System.out.println(cites);
		System.out.println("Null value not allowed in Treeset");
	 
			}
	}
}
