import java.io.*;
import java.util.*; 
 
public class Main 
{
    	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();  
		while(t-->0)
		{int c=0;
		    long s=sc.nextLong();
		    while(c<1000)
		    {
		        long k=rev(s);
		        long sum=k+s;
		        c++;
		        long ss=rev(sum);
		        if(ss==sum)
		        {
		            System.out.println(c+" "+ss);
		            break;
		        }
		        else
		            s=sum;
		}
	}
	}
	static long rev(long n)
	{long re=0,r=0,s=n;
	    while(s!=0)
	    {
	        r=s%10;
	        re=re*10+r;
	        s/=10;
	    }
	
	    return re;
	}
}
