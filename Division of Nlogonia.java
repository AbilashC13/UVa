import java.util.*;
import java.io.*;

public class Main
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          int t= 0;

          do
          {
               t= sc.nextInt();

               if (t == 0) break;

               int N = sc.nextInt();
               int M = sc.nextInt();

               for (int i = 0; i < t; i++)
               {
                    int X = sc.nextInt();
                    int Y = sc.nextInt();

                    if (X == N || Y == M)
                         System.out.println("divisa");
                    else if (X > N && Y > M)
                         System.out.println("NE");
                    else if (X < N && Y > M)
                         System.out.println("NO");
                    else if (X < N && Y < M)
                         System.out.println("SO");
                    else
                         System.out.println("SE");
               }

          } while (t!= 0);

        
     }
}
