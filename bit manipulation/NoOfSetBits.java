import java.util.Scanner;

public class NoOfSetBits {
    

    //count the no. of set bits
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int cnt = 0;

        //perform a while loop until no. becomes 0
        //cnt when n & (n-1) !=0 // it removes last set bit to 0

        while(n !=0)
        {
            n = n & (n-1);
            cnt ++;
        }
        System.out.println("No. of set bits: "+cnt);

    }
}
