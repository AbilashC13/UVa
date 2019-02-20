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
		while(t-->0)
		{
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int c=0;
			for(int i=n-1;i>0;i--)
			{
				for(int j=0;j<i;j++)
				{
				   if(a[i]>=a[j])
				   {
				   	 c++;
				   }
				}
			}
			System.out.println(c);
		}
	}
}
