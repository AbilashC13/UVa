import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
		{
		    int m=sc.nextInt();
		     if(m<0)
		     break;
		     double d=sc.nextDouble();
		     double l=sc.nextDouble();
		     int n=sc.nextInt();
		     double [] values=new double [m+1];
		     for(int i=0;i<n;i++)
		     {
		         int mo=sc.nextInt();
		         double r=sc.nextDouble();
		         r=1-r;
		         for(int j=mo;j<values.length;j++)
		         values[j]=r;
		     }
		     double mp=l/m;
			double owe=l;
			double car=(l+d)*values[0];
			int month=1;
			while (owe > car && month<values.length) {
				owe-=mp;
				car*=values[month];
				month++;
			}
			month--;
			
			if (month==1) {
				System.out.println("1 month");
			} else {
				System.out.println(month+" months");
			}
		}
	}
}
