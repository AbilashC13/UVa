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
		Scanner sc=new Scanner(System.in);int t=1;
		while(true)
		{
			int n=sc.nextInt(),c=0;
			if(n==0)
			   break;
			for(int i=0;i<n;i++)
			{
				int s=sc.nextInt();
				if(s==0)
				  c++;
			}
			System.out.println("Case "+(t++)+": "+(n-(2*c)));
		}
	}
}
