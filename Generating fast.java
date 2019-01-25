import java.util.*;


class Main {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int t= sc.nextInt();
StringBuffer bf = new StringBuffer("");
sc.nextLine();
for (int i =0; i<t ; i++) {
 if (i>0) bf.append("\n");
 char [] a =sc.nextLine().toCharArray();
 Arrays.sort(a);
 do{
  bf.append(new String(a)+"\n");
 }while(nextPermutation(a));
}
System.out.println(bf); 
  
 }static boolean nextPermutation(char[] p) {
        for (int a = p.length - 2; a >= 0; --a) {
            if (p[a] < p[a + 1]) {
                for (int b = p.length - 1;; --b) {
                    if (p[b] > p[a]) {
                        char t = p[a];
                        p[a] = p[b];
                        p[b] = t;
                        for (++a, b = p.length - 1; a < b; ++a, --b) {
                            t = p[a];
                            p[a] = p[b];
                            p[b] = t;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
