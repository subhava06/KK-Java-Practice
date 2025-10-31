import java.util.Scanner;

public class ToggleTheBit {
    

    //toggle the ith bit : 1-> 0 and 0-> 1
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. and ith bit");
        int n = sc.nextInt();
        int i = sc.nextInt();
        
        //move to that bit using << and do XOR(^) to toggle
        int ans = n ^ (i<<i);
        System.out.println(i+"th bit is toggled and o/p is "+ans);
    }
}
