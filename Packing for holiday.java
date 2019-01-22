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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int l=sc.nextInt();
			int b=sc.nextInt();
			int h=sc.nextInt();
			if(l>20||b>20||h>20)
			   System.out.println("Case "+i+": bad");
			else
			   System.out.println("Case "+i+": good");
		}
	}
}
