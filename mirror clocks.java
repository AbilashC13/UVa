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
	        String s=sc.next();
	        String a=s.substring(0,2);
	        String b=s.substring(3);
	        int h=Integer.parseInt(a);
	        int m=Integer.parseInt(b);
	        
	        m=(60-m)%60;
	        h=12-h;
	        if(m!=0)
	            --h;
            h=(h+12)%12;
            if(h==0)
                h=12;
            System.out.printf("%02d:%02d\n", h, m);
	    }
	}
}
