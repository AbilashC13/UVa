/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		 int count=0;
	while(sc.hasNext())
	{  
	    count++;
	    System.out.println("Case "+count+":");
		String s=sc.next();
		char[] c=s.toCharArray();
		int n=sc.nextInt();
		while(n-->0)
		{   int c1=0,c2=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int min=Math.min(a,b);
			int max=Math.max(a,b);
			for(int i=min;i<=max;i++)
			{
				if(c[i]=='0')
				  c1++;
				if(c[i]=='1')
				  c2++;
			}if(c1==max-min+1||c2==max-min+1)
			{
				System.out.println("Yes");
			}
			else
			    System.out.println("No");
		}
		
	}
	}
}
