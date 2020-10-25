import java.util.*;

/*
	Rule 05. Object Orientation (OBJ)
	OBJ01-J. Limit accessibility of fields
	
	Accessor methods provide controlled access to fields outside of the package 
	in which their class is declared. This compliant solution declares total as 
	private and provides a public accessor. The add() and remove() methods modify
	its value while preserving class invariants. 

	Noncompliant Code Example 

	public class Widget {
  		public int total; // Number of elements
 
  		void add() {
    		if (total < Integer.MAX_VALUE) {     
      			total++;
      			// ...
    		} else {
      			throw new ArithmeticException("Overflow");
    		}
  		}
 
  		void remove() { 
    		if (total > 0) {     
      			total--;
      			// ...
    		} else {
      			throw new ArithmeticException("Overflow");
    		}
  		}
	}
*/

// Should be in another file. Widget.java
// public
class Widget 
{
	private int total; // Declared private
 
  	public int getTotal () 
  	{
    	return total;
	}

	void add() 
	{
		if (total < INT_MAX)
    		total++;
    	else 
      		throw new ArithmeticException("Overflow");
  	}

  	void remove() 
  	{ 
    	if (total > 0)   
    		total--;
    	else 
      		throw new ArithmeticException("Overflow");
}

public class R05_OBJ01_J 
{
    public static void main(String[] args) 
    {
    	Widget x = new Widget();
    	x.add();
    	System.out.println(x.getTotal());
    }
}