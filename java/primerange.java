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
		int i,j;
		for(i=f+1;i<l;i++)
		{
			int k=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				k=k+1;
				break;
				}
			}
			if(k==0)
			System.out.print(i+" ");
		}
	}
}
