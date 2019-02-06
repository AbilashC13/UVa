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
			String s="left";
			int l=sc.nextInt();
			l*=100;
			int c=0,f=0;
			int m=sc.nextInt();
			String curside="";
			while(m-->0)
			{
				int car=sc.nextInt();
				String side=sc.next();
				if(side!=s)
				{
				 c++;
				 curside=side;
				 f=car;
				}
				else
				{
					if(f+car>l)
					{
						c+=2;
						f=car;
						
					}
					else
					   f+=car;
				}
				
			}
			if(f!=0)
			{
				c++;
			}System.out.println(c);
		}
	}
}
