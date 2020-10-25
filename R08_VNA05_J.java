import java.util.*;

/*
	Rule 08. Visibility and Atomicity (VNA)
	VNA05-J. Ensure atomicity when reading and writing 64-bit values

	This compliant solution declares i volatile. Writes and reads of long and double volatile values are always atomic.


	Noncompliant Code Example 

	class LongContainer {
  		private long i = 0;
 
  		void assignValue(long j) {
    		i = j;
 	 	}
 
  		void printLong() {
    		System.out.println("i = " + i);
  		}
	}
*/

class LongContainer 
{
	private volatile long i = 0;

	void assignValue(long j) 
	{
		i = j;
	}

	void printLong() 
	{
		System.out.println("i = " + i);
	}
}

public class R08_VNA05_J 
{
    public static void main(String[] args) 
    {
    	LongContainer x = new LongContainer();
    	x.assignValue(8);
    	x.printLong();
    }
}