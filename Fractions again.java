
import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
		    int k=sc.nextInt(),c=0;
		    for(int i=k+1;i<=2*k;i++)
		    {
		        if((i*k)%(i-k)==0)
		            c++;
		    }
		    System.out.println(c);
		    for(int i=k+1;i<=2*k;i++)
		    {
		        if((i*k)%(i-k)==0)
		            System.out.println("1/"+k+" = 1/"+(i*k)/(i-k)+" + 1/"+i);
		    }
		}
	}
}
