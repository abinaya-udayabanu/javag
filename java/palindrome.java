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
		int rev=0,rem;
		int n1=n;
		while(n1>0)
		{
			rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
		}
		if(n==rev)
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
