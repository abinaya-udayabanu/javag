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
		int f=in.nextInt();
		int l=in.nextInt();
		int j,sum;
		int rem,pow;
		int n2,c,n;
		for(n=f+1;n<l;n++)
		{
			c=(int)Math.log10(n)+1;
		n2=n;
		sum=0;
		while(n2>0)
		{
		            rem=n2%10;
			pow=(int)Math.pow(rem,c);
			sum=sum+pow;
			n2=n2/10;
		}
		if(n==sum)
		System.out.print(sum+" ");
	
	}
}}
