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
		int t=sc.nextInt();
		for(int tc=0;tc<t;tc++)
		{
			int n=sc.nextInt();
			int c1=0,c2=0;
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			   a[i]=sc.nextInt();
			for(int i=0;i<n-1;i++)
			{
				if(a[i]<a[i+1])
				 c1++;
			    else if(a[i]>a[i+1])
			     c2++;
			}
			int x=tc+1;
			System.out.println("Case "+x+": "+c1+" "+c2);
		}
	}
}
