import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n;i++) 
        {
            int sum=sc.nextInt();
			int diff=sc.nextInt();
			if (sum<diff || (sum+diff)%2!=0) {
				System.out.println("impossible");
			} else {
				int x=(sum+diff)/2;
				int y=(sum-diff)/2;
				System.out.println(Math.max(x,y)+" "+Math.min(x,y));
			}
		}
	}
}
