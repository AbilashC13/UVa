import java.util.*;
import java.lang.*;
import java.io.*;
class eventplan
 {
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n=sc.nextInt();
			int b=sc.nextInt();
			int h=sc.nextInt();
			int w=sc.nextInt();
			int m=Integer.MAX_VALUE,f=0,s=b;
			for(int i=0;i<h;i++)
			{
				int p=sc.nextInt();
				int[] a=new int[w];
				for(int j=0;j<w;j++)
				{
					a[j]=sc.nextInt();
					if(a[j]>=n)
					m=n*p;
					if(m<=b&&s>m)
					{
						s=m;
						f=1;
					}
				}
			}
			if(f==0||s==0)
			System.out.println("stay home");
			else
			System.out.println(s);
		}
	}
}
