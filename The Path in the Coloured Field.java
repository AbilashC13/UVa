	
import java.io.*;
import java.util.*;
 
public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) 
        {
            String s = br.readLine();
            if (s == null)
                break;
            int m = Integer.parseInt(s);
            char[][] a = new char[m][];
            for (int i = 0; i < a.length; i++)
                a[i] = br.readLine().toCharArray();
            int maximin = 0;
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (a[i][j] == '1')
                    {
                        int min = 2 * m;
                        for (int k = 0; k < m; k++)
                        {
                            for (int l = 0; l < m; l++)
                            {
                                if (a[k][l] == '3'&& Math.abs(k - i) + Math.abs(l - j) < min)
                                    min = Math.abs(k - i) + Math.abs(l - j);
                            }
                        }
                        if (min > maximin)
                            maximin = min;
                    }
                }
            }
            System.out.println(maximin);
        }
    }
}
