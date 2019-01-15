import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int rfp = 1;
 
    while (true) {
      int n = s.nextInt(), p = s.nextInt(); s.nextLine();
      
      if (n == 0 && p == 0) break;
      if (rfp > 1) System.out.println();
      for (int i=0;i < n; i++) s.nextLine();
      String bestProposal = "";
      int bestProposalReqs = Integer.MIN_VALUE;
      double bestProposalPrice = Double.MAX_VALUE;
      for (int i =0; i < p; i++) {
        String proponent = s.nextLine();
        double price = s.nextDouble();
        int reqs = s.nextInt(); s.nextLine();
        for (int j=0;j < reqs; j++) s.nextLine();
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
