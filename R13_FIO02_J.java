import java.util.*;
import java.io.File;

/*
	Rule 13. Input Output (FIO)
	FIO02-J. Detect and handle file-related errors

	This noncompliant code example attempts to delete a specified file but gives 
	no indication of its success. The Java platform requires File.delete() 
	to throw a SecurityException only when the program lacks authorization to 
	delete the file [API 2014]. No other exceptions are thrown, so the deletion can silently fail.

	Noncompliant Code Example 

	File file = new File(args[0]);
		file.delete();
*/


public class R13_FIO02_J
{
    public static void main(String[] args) 
    {
    	File file = new File("file");
		if (!file.delete())
  			System.out.println("Deletion failed");
    }
}
