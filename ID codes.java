/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String s=sc.next();
			if(s=="#")
			   break;
			char [] c =s.toCharArray();
			if(next_permutation(c))
			{
				System.out.println(new String(c));
			}
			else
			{
			     System.out.println("No Successor");
			}
		     	
		}
	}
		public static boolean next_permutation(char a[])
    {
       for(int i = a.length-2, j; i >= 0; i--)
       {
        if (a[i+1] > a[i])
               {
                for(j = a.length-1; a[j] <= a[i]; j--);
					 swap(a, i, j);
    		    for(j = 1; j <= (a.length-i)/2; j++)
    				 swap(a, i+j, a.length-j);
              return true;
               }
        }
         return false;
   }


 public static void swap(char a[], int i, int j)
 {
  char temp = a[i];
  a[i] = a[j];
   a[j] = temp;
      }
	
}
