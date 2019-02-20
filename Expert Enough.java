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
			String[] s=new String[n];
			int[] a=new int[n];
			int[] b=new int[n];
			for(int i=0;i<n;i++)
			{
				s[i]=sc.next();
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int[] v=new int[m];
			for(int i=0;i<m;i++)
			    v[i]=sc.nextInt();
			    
			for(int i=0;i<m;i++)
			{int c=0,ind=0;
				for(int j=0;j<n;j++)
				{
					if(v[i]>=a[j]&&v[i]<=b[j])
					{
						c++;
						ind=j;
					}
				}
				if(c==1)
				{
					System.out.println(s[ind]);	
				}
				else
				    System.out.println("UNDETERMINED");
			}
			if(t>0)
			System.out.println();
			 
		}
	}
}
