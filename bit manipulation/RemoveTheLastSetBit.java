import java.util.Scanner;

public class RemoveTheLastSetBit {
    
    // Remove the last set bit( from right )

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int n = sc.nextInt();

        // perform & of n and (n-1) this remove the last set bit
        // and if we use a loop until n is 1, we get to count the no. of set bits
        
        int ans= n & (n-1);
        System.out.println("Removed the last set bit and the result is "+ans);
        
    }
}
