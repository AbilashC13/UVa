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
	    boolean time[]=new boolean[1000001];
		for(;;)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n == 0 && m == 0)
				break;
			boolean conflict=false;
			Arrays.fill(time,false);
			for(int i=0;i<n;i++)
			{
				int s=sc.nextInt();
				int e=sc.nextInt();
				if(!conflict && !check(s,e,time)) 
					conflict = true;
			}
			for(int i=0;i<m;i++)
			{
				int s=sc.nextInt();
				int e=sc.nextInt();
				int r=sc.nextInt();
				while(!conflict && s < 1000000)
				{
				if(!check(s,e,time)) 
					conflict = true;
                s += r;
                e =Math.min(e + r,1000000);
				}
			}
			if(!conflict)
			  System.out.println("NO CONFLICT");
			else
			  System.out.println("CONFLICT");
			
		}

	}
public static boolean check(int s,int e,boolean time[])
	{
		int i=0;
    	for(i = s; i < e; i++) 
    	{
        	if(time[i]) 
        		return false;
        	time[i] = true;
		}
    	return true;
	}
}
