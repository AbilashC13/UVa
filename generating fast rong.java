import java.util.*;


class Main {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int t= sc.nextInt();
for (int i =0; i<t ; i++) {
 if (i>0) 
  System.out.println();
 char [] a =sc.next().toCharArray();
 Arrays.sort(a);
 do{
  System.out.println(new String(a));
 }while(next_permutation2(a));
}
  
 }
 public static boolean next_permutation2(char a[])
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
