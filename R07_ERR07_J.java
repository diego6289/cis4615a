import java.util.*;

/*
	Rule 07. Exceptional Behavior (ERR)
	ERR07-J. Do not throw RuntimeException, Exception, or Throwable


	This compliant solution throws NullPointerException to denote the specific exceptional condition

	Noncompliant Code Example 

	boolean isCapitalized(String s) {
  		if (s == null) {
    	throw new RuntimeException("Null String");
  		}
		if (s.equals("")) {
		   return true;
		}
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		return (first.equals(first.toUpperCase()) &&
		        rest.equals(rest.toLowerCase()));
}

*/

public class R07_ERR07_J 
{
    public static void main(String[] args) 
    {
    	System.out.println(isCapitalized(null));
    }

    public static boolean isCapitalized(String s)
    {
  		if (s == null) 
    		throw new NullPointerException();
  		if (s.equals("")) 
    		return true;
  		
  		String first = s.substring(0, 1);
  		String rest = s.substring(1);
  		return (first.equals(first.toUpperCase()) &&
        	rest.equals(rest.toLowerCase()));
  	}
}
