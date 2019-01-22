import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			if (s.length() == 3) {
				if ((s.charAt(0) == 'o' && s.charAt(1) == 'n')
						|| (s.charAt(0) == 'o' && s.charAt(2) == 'e')
						|| (s.charAt(1) == 'n' && s.charAt(2) == 'e'))
					System.out.println("1");
				else
					System.out.println("2");

			} else
				System.out.println("3");
		}
	}
}
