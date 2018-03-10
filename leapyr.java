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
		int i=in.nextInt();
		if(i%400==0)
		System.out.print("Leap Year");
		else if(i%100==0)
		System.out.print("Non Leap Year");
		else if(i%4==0)
		System.out.print("Leap Year");
		else
		System.out.print("Non Leap Year");
	}
}
