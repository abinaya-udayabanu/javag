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
		int sum=0;
		int rem,pow;
		int n1,n2,c=0;
		n1=n;
		while(n1>0)
		{
			n1=n1/10;
			c=c+1;
		}
		n2=n;
		while(n>0)
		{
			rem=n%10;
			pow=(int)Math.pow(rem,c);
			sum=sum+pow;
			n=n/10;
		}
		if(n2==sum)
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
