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
		while(true)
		{
			int n=sc.nextInt();
			if(n==0)
			    break;
			ArrayList<Integer> a=new ArrayList<Integer>(n);
			for(int i=0;i<n;i++)
			   a.add(sc.nextInt());
			Collections.sort(a);
			int c=a.get(0),c1=0;
			for(int i=0;i<n-1;i++)
			{
				c=c+a.get(i+1);
				c1+=c;
			}
			System.out.println(c1);
		}
	}
}
