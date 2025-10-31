import java.util.Scanner;

public class ClearTheBit {
    

    //clear the ith bit

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        System.out.println("Enter the ith bit");
        int n = sc.nextInt();
        int i = sc.nextInt();

        if((n & (1<<i)) !=0) {
            System.out.println(i+"th bit is set.");
            int ans = n & (~(1<<i));
            System.out.println("Cleared the ith bit and result is "+ans);

        }
        else{
            System.out.println(i+"th bit already set to zero");
        }
    }
}
