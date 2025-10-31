import java.util.Scanner;

public class SetTheBit {
    

    //set the ith bit

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        System.out.println("Enter the ith bit");
        int n = sc.nextInt();
        int i = sc.nextInt();

        if((n & (1<<i)) ==0) {
            System.out.println("Setting the "+i+"th bit");
            int ans = n | (1<<i);
            System.out.println("ith bit set and output is "+ans);
        }
        else {
            System.out.println(i+"th bit is set, no changes needed");
        }
    }
}
