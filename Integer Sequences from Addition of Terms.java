

import java.io.*;
import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
    		int n=sc.nextInt();
    		long a[]=new long[n+1];
    		for(int i=0;i<n+1;i++)
    		a[i]=sc.nextLong();
    		long d=sc.nextLong();
    		long k=sc.nextLong();
    		long e=1;
    		long o=d;
    		for(int i=1;i<=k;i++)
    		{
    		    if(i>d)
    		    {
    		        e++;
    		        d=d+(e*o);
    		    }
    		}
    		long r=a[0];
    	    k=e;
    		for(int i=1;i<=n;i++)
    		{
    		    r=r+(a[i]*e);
    		    e=e*k;
    		}
    		System.out.println(r);
		}
	}
}
