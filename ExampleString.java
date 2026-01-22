//A String in Java is an object that represents a sequence of characters.
//Strings are immutable, which means once a String is created, its value cannot be changed.
//
//String name = "Ashwini";
//
//Why Strings are Immutable?

//Security (used in passwords, database URLs)

//Thread-safe

//Memory efficient (String pool reuse)
//
//| Method               | Description                |
//| -------------------- | -------------------------- |
//| `length()`           | Returns length of string   |
//| `toUpperCase()`      | Converts to uppercase      |
//| `toLowerCase()`      | Converts to lowercase      |
//| `charAt(index)`      | Returns character at index |
//| `contains()`         | Checks substring           |
//| `equals()`           | Compares content           |
//| `equalsIgnoreCase()` | Ignores case               |
//| `substring()`        | Extracts part of string    |
//| `trim()`             | Removes spaces             |
//| `replace()`          | Replaces characters        |

       

package Ashwini;

public class ExampleString {

	public static void main(String[] args)
	{
		String name = "Ashwini";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
	}
}
