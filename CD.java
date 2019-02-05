
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt(), m = sc.nextInt();
			if (n + m == 0)
			      break;

			Set<Integer> a = new TreeSet<Integer>();
			for (int i = 0; i < n; i++) {
				a.add(sc.nextInt());
			}

			int c = 0;
			for (int i = 0; i < m; i++) {
				if (a.contains(sc.nextInt())) {
					c++;
				}
			}

			System.out.println(c);
		}
	}
}
