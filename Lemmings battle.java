import java.io.*;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int B = sc.nextInt();
            int SG =sc.nextInt();
            int SB =sc.nextInt();

            PriorityQueue<Integer> QG = new PriorityQueue<Integer>(SG, new Comparator<Integer>()
            {
                public int compare(Integer o1, Integer o2)
                {
                    if (o1 > o2) 
                    {
                        return -1;
                    }
                    return 1;
                }
            });
            for (int i = 0; i < SG; i++)
            {
                QG.add(sc.nextInt());
            }

            PriorityQueue<Integer> QB = new PriorityQueue<Integer>(SB, new Comparator<Integer>() 
            {
                public int compare(Integer o1, Integer o2) 
                {
                    if (o1 > o2)
                    {
                        return -1;
                    }
                    return 1;
                }
            });
            for (int i = 0; i < SB; i++)
            {
                QB.add(sc.nextInt());
            }

            while (true) {
                if (QG.isEmpty() && QB.isEmpty()) 
                {
                    System.out.println("green and blue died");
                    break;
                } else if (QG.isEmpty()) 
                {
                    System.out.println("blue wins");
                    while (!QB.isEmpty()) 
                    {
                        System.out.println(QB.poll());
                    }
                    break;
                } else if (QB.isEmpty()) 
                {
                    System.out.println("green wins");
                    while (!QG.isEmpty())
                    {
                        System.out.println(QG.poll());
                    }
                    break;
                } else 
                {
                    int count = 0;
                    List<Integer> LG = new ArrayList<Integer>();
                    List<Integer> LB = new ArrayList<Integer>();
                    while (!QG.isEmpty() && !QB.isEmpty() && count < B) 
                    {
                        int a = QG.poll();
                        int b = QB.poll();
                        if (a > b) {
                            LG.add(a - b);
                        } else if (b > a)
                        {
                            LB.add(b - a);
                        }
                        count++;
                    }
                    QG.addAll(LG);
                    QB.addAll(LB);
                }
            }
            if (t > 0)
            {
                System.out.println();
            }
        }
    }
}
