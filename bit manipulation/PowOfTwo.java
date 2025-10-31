import java.util.Scanner;

public class PowOfTwo {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int N = sc.nextInt();
      // boolean ans = N & (N-1);
       if(N>0 && (N & (N-1)) == 0) System.out.println(N+" is a power of 2");
       else System.out.println(N+" is not a power of 2");
       

    }
}
