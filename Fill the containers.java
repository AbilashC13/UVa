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
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			   a[i]=sc.nextInt();
			int v=-1,h=Integer.MAX_VALUE,l=1;
			while(l<=h)
			{
				int mid=l+(h-l)/2;
				if(possible(a,n,m,mid))
				{
					v=mid;
					h=mid-1;
				}
				else
					l=mid+1;
			}
			System.out.println(v);
		}
	}
	static boolean possible(int[] c, int vessels, int containers, int testedCapacity)
	{
		int x = 0,  y = testedCapacity;
		while(x < vessels && containers > 0)
			if(c[x] <= y)
				y -= c[x++];
			else
			{
				y = testedCapacity;
				--containers;
			}
		return x == vessels;
	}
}
