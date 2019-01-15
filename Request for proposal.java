import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int rfp = 1;
 
    while (true) {
      int n = sc.nextInt(), p = sc.nextInt(); sc.nextLine();
      
      if (n == 0 && p == 0) break;
      if (rfp > 1) System.out.println();
      for (int i=0;i < n; i++) sc.nextLine();
      String bestProposal = "";
      int bestProposalReqs = Integer.MIN_VALUE;
      double bestProposalPrice = Double.MAX_VALUE;
      for (int i =0; i < p; i++) {
        String proponent = sc.nextLine();
        double price = sc.nextDouble();
        int reqs = sc.nextInt(); sc.nextLine();
        for (int j=0;j < reqs; j++) sc.nextLine();
        if (reqs > bestProposalReqs || (reqs == bestProposalReqs && price < bestProposalPrice)) {
          bestProposal = proponent;
          bestProposalReqs = reqs;  
          bestProposalPrice = price;
        } 
      }
      System.out.println("RFP #" + rfp + '\n' + bestProposal);
      rfp++;
    }
    s.close();
  }

}
