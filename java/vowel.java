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
		char i=in.next().charAt(0);
		if(Character.isLetter(i))
		{
		i=Character.toLowerCase(i);
		if(i=='a'||i=='e'||i=='o'||i=='u'||i=='i')
			System.out.print("Vowel");
		else
			System.out.print("Consonant");
		}
		else
		{
			System.out.print("enter a character");
		}
	}
}
