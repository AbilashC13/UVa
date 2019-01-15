import java.util.*;
import java.lang.*;
import java.io.*;

class costcutting {
public static void main (String[] args) 
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
    ArrayList<Integer>a=new ArrayList<Integer>();
    a.add(sc.nextInt());
    a.add(sc.nextInt());
    a.add(sc.nextInt());
    Collections.sort(a);
    System.out.println("Case "+(i+1)+": "+a.get(1));
}
}
}
