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
		int n=in.nextInt();
		int f=0;
		int i;
		for(i=2;i<n/2;i++)
		{
		       if(n%i==0)
		       f=f+1;
		}
		if(f==1)
		System.out.print("No");
		else
		System.out.print("Yes");
	}
}
