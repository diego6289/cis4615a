import java.util.*;

/*
    Rule 06. Methods(MET)
    Met01-J. Never use assertions to validate method arguments.
    
    public static int getAbsAdd(int x, int y)
    {
       assert x != Integer.MIN_VALUE;
       assert y != Integer.MAX_VALUE;
       int absX = Math.abs(x);
       int absY = Math.abs(y);
       assert (absX <= Integer.MAX_VALUE - absY);
       return absX + absY;
    }

    This compliant solution validates the method arguments by ensuring that values 
    passed to Math.abs() exclude Integer.MIN_VALUE and also by checking for integer overflow:
*/ 

public class R06_MET01_J 
{
    public static void main(String[] args) 
    {
	     System.out.print(getAbsAdd(-1, 5));
    }
    
    public static int getAbsAdd(int x, int y)
    {
      if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE)
      {
         throw new IllegalArgumentException();
      }
      int absX = Math.abs(x);
      int absY = Math.abs(y);
      if (absX > Integer.MAX_VALUE - absY)
      {
         throw new IllegalArgumentException();
      }
      return absX + absY;
    }
}
