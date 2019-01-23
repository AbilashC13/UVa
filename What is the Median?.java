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
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(sc.hasNextInt())
		{
			int s=sc.nextInt();
			a.add(s);
			for(int i=0;i<1;i++)
			{
				Collections.sort(a);
				int m=0;
				int l=a.size();
				if(l%2==0)
				   m=((a.get(l/2)+a.get((l/2)-1))/2);
				else
				   m=a.get((l/2));
				System.out.println(m);
			}
		}
	}
}
