import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt(),k=0;
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        ArrayList a1=new ArrayList<Integer>(n);
	        for(int i=0;i<n;i++)
	        {
	            a1.add(sc.nextInt());
	        }
	        k++;
	        System.out.println("Case "+k+": "+Collections.max(a1));
	    }
	 }
}
