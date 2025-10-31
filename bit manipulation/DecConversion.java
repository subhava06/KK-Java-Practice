import java.util.Scanner;

public class DecConversion {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         // bin to dec conversion
        System.out.println("Enter the bin no.");
        String n1 = sc.nextLine();

        System.out.println("Dec equivalent of "+n1+" is "+bin2Dec(n1));
    }

    // bin to decimal conv
     public static int bin2Dec(String bin)
    {
     // if (n == 0) return "0";

     char[] bin1 = bin.toCharArray();
      int dec =0;
      int n = bin.length();
      int p2 = 1; //power of 2 is initially set as 1
      

     
      for(int i = n-1; i>=0; i--)
      {
        if(bin1[i] == '1') dec = dec + p2;
        p2 = p2 *2;
      }

      return dec;
    }
}
