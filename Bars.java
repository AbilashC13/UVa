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
		    int val=sc.nextInt();	
		    int n=sc.nextInt();
		    int a[]=new int[1001];
		    a[0]=1;
		    for(int i=0;i<n;i++)
		    {
		    	int p=sc.nextInt();
		    	for(int j=val-p;j>=0;j--)
		    	{
		    		if(a[j]==1)
		    		{
		    			a[j+p]=1;
		    		}
		    	}
		    }
		    if(a[val]==1)
		     System.out.println("YES");
		    else
		     System.out.println("NO");
		      
		}
	}
}
