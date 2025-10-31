//find the number that appears odd no. of times

import java.util.Scanner;

public class SingleNoInArr {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        System.out.println("Enter the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0; i<=n-1; i++)
        {
           nums[i] = sc.nextInt();
        }

        // perform XOR(^) on every elem of arr

        int XOR =0;
        for(int i=0; i<=n-1; i++){
            XOR = XOR ^ nums[i];
        }

        System.out.println("Odd one out is :"+XOR);

        
    }
    
}
