package FileHandling;


//1. Creating new file (tech.text)


import java.io.File;

import java.io.IOException;


public class CreateFileExample
{
public static void main(String[] args)
{
try {
	File file=new File("Tech.txt");
	
	if(file.createNewFile())
{
	System.out.println("File created Successfully");
}
else
{
	System.out.println("File alredy exists");
 
}
}
catch(IOException e)
{
	e.printStackTrace();
}
}
}

/*
 
  Why try–catch is needed while creating a file
 Because it is a checked exception, Java forces us to handle it using try–catch or throws.
 
 try {
    file.createNewFile();
} catch (IOException e) {
    e.printStackTrace();
}


What is e.printStackTrace();?

It prints the complete error details on the console.

 */



