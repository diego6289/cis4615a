import java.io.File;

/* 
	Rule 02. Expressions (EXP)
	XP00-J. Do not ignore values returned by methods.

	The noncompliant code example attempts to delete a file but fails to 
	check whether the operation has succeeded:

	This compliant solution checks the Boolean value returned by the delete() 
	method and handles any resulting errors:
*/

	public class R02_XP00_J 
	{

    	public static void main(String[] args) 
    	{
      		File someFile = new File("someFileName.txt");
      		// Do something with someFile
      		if (!someFile.delete()) 
      		{
        		System.out.println("Deletion failed");
      		}
     
    }
}
