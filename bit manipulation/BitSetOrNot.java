import java.util.Scanner;

public class BitSetOrNot {

    //check if ith bit set or not
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. ");
        System.out.println("Enter the ith bit");
        int n = sc.nextInt();
        int i = sc.nextInt();

        if((n & (1 << i)) !=0) System.out.println(i+"th bit is set");
        else System.out.println("Not set");
    }
    
}
