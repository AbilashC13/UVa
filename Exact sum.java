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
		while(sc.hasNextInt())
		{
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			    a[i]=sc.nextInt();
			Arrays.sort(a);
			int m=sc.nextInt();
			int i=0,j=n-1;
			int x=0,y=0;
			while(i<j)
			{
				if(a[i]+a[j]<m)
				    i++;
				else if(a[i]+a[j]==m)
				{
					x=i;
					y=j;
					i++;j--;
				}
				else
					j--;
			}
			System.out.println("Peter should buy books whose prices are "+a[x]+" and "+a[y]+".\n");
		}
	}
}
/*
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
		{
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    int min=0,max=0;
	    Arrays.sort(a);
	    for(int i=0;i<n-1;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i]+a[j]==k)
	            {
	                    min=a[i];
	                    max=a[j];
	            }
	        }
		}
		
		System.out.println("Peter should buy books whose prices are "+min+" and "+max+".\n");
		}
	}
}
*/
