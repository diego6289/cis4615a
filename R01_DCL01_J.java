import java.util.*;

/*
	Rule 01. Declarations and Initialization (DCL)
	DCL01-J. Do not reuse public identifiers from the Java Standard Library

This compliant solution uses a different name for the class, preventing any potential shadowing of the class from the Java Standard Library:*/

/* 
	Noncompliant Code Example 

	class Vector {
	  private int val = 1;
	 
	  public boolean isEmpty() {
	    if (val == 1) {   // Compares with 1 instead of 0
	      return true;
	    } else {
	      return false;
	    }
	  }
	  // Other functionality is same as java.util.Vector
	}
	 
	// import java.util.Vector; omitted
	public class VectorUser {
	  public static void main(String[] args) {
	    Vector v = new Vector();
	    if (v.isEmpty()) {
	      System.out.println("Vector is empty");
	    }
	  }
	}
}
*/

class myVector
{
	private int val = 1;
	 
	 public boolean isEmpty() 
	 {
	    if (val == 1) 
	    	return true;
	    else 
	      	return false;
	}
}

public class R01_DCL01_J 
{
    public static void main(String[] args) 
    {
    	Vector v = new Vector();
    	if (v.isEmpty()) 
      		System.out.println("Vector is empty");
    }
}