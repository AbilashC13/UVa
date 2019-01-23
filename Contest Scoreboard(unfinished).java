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
		while(t-->0)
		{
			ArrayList<Integer> a=new ArrayList<Integer>();
			ArrayList<Integer> b=new ArrayList<Integer>();
			ArrayList<Integer> c=new ArrayList<Integer>();
			ArrayList<Character> d=new ArrayList<Character>();
			while(sc.hasNextInt())
			{
				a.add(sc.nextInt());
				b.add(sc.nextInt());
				c.add(sc.nextInt());
				d.add(sc.next().charAt(0));
			}
			for(int i=0;i<a.size();i++)
			{
				for(int j=i;j<a.size();j++)
				{
					
				}
			}
			System.out.println();
		}
	}
}
