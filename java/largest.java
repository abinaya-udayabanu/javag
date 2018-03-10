/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a>=b && a>=c)
			System.out.print(a);
		else if(b>a && b>=c)
		    	System.out.print(b);
		else
		    	System.out.print(c);
	}
}
