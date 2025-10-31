// count the min no. of bits to be flipped to 
// to convert A to B

import java.util.Scanner;

public class MinFlipBits {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and goal no. ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Step 1: XOR(^) of a and b gives a no. that contains the no. of bits to be flipped
        int ans = a ^ b;

        // Step2: now cnt no. of set bits. they are our flipped bits

        int cnt =0;
        while(ans !=0)
        {
           ans = (ans &(ans-1));
           cnt++;
        }

        System.out.println("Minm flipped bits are "+cnt);
    }
}
