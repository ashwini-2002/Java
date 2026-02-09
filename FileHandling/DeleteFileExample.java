//For Deleting File
package FileHandling;

import java.io.File;

public class DeleteFileExample {
	public static void main(String[] args)
	{
		File file = new File("Tech1.txt");
		if (file.delete()) {
		    System.out.println("File deleted successfully");
		} else {
		    System.out.println("File not found");
		}

	}
	}



/*

createNewFile() throws IOException, so try–catch is required,
 but delete() returns boolean, so try–catch is not required.
 
 
 
 Optional (If mam asks “Can we use try–catch for delete?”)

*** Yes, but not mandatory

try {
    file.delete();
} catch (Exception e) {
    e.printStackTrace();
}

*/