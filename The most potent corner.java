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
			int[] a=new int[(int)Math.pow(2,n)];
			int [][]potency = new int[a.length][2];
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{   
				for(int j=0;j<n;j++)
				{
					potency[i][0]+=a[(i^(1<<j))];
				}
				potency[i][1]=potency[i][0];
				for(int j=0;j<n;j++)
				{
					int x = potency[i][0]+potency[(i^(1<<j))][0];
					if(x>potency[i][1])potency[i][1]=x;
				}
			}
			int result = 0;
			for(int i = 0;i<a.length;i++)
			{
				result = Math.max(result,potency[i][1]);
			}
			System.out.println(result);
		}
	}
}
