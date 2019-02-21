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
		int c=1;
		while(true)
		{
		
			int n=sc.nextInt();
			if(n==0)
			   break;
			System.out.println("Case "+(c++)+":");
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			    a[i]=sc.nextInt();
			int m=sc.nextInt();
			int b[]=new int[m];
			for(int i=0;i<m;i++)
			    b[i]=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
				   al.add(a[i]+a[j]);
				}
			}
			Collections.sort(al);
			for(int i=0;i<m;i++)
			{
				int minimum=Integer.MAX_VALUE,val=0;
				for(int j=0;j<al.size();j++)
				{
					if(minimum>Math.abs(al.get(j)-b[i]))
					{
						minimum=Math.abs(al.get(j)-b[i]);
						val=al.get(j);
					}
				}
				System.out.println("Closest sum to "+b[i]+" is "+val+".");
			}
		
		}
	}
}
