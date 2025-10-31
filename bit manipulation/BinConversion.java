// bin to decimal and vice versa conversion

import java.util.Scanner;

public class BinConversion {

    public static void main(String[] args) {
        

        //swap two numbers
        int a = 5, b = 6;
        System.out.println("before swap: "+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap: "+a+" "+b);

        // dec to bin conversion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal no.");
        int n = sc.nextInt();

        System.out.println("Bin equivalent of "+n+" is "+dec2Bin(n));


    
    }

    // Decimal to binary conversion
    public static String dec2Bin(int n)
    {
      if (n == 0) return "0";

      StringBuilder ans = new StringBuilder();
      while(n >=1)
      {
         ans.append(n % 2);
         n = n/2;
      }
     // if(n / 2 ==1) ans.append('1');

      return ans.reverse().toString();
    }
    
}
