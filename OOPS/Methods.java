import java.util.*;
public class Methods {
    public static void main(String[] args) {
        //Armstrong  no.
        System.out.println("Enter the no. :" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println(armstrong(n));
        
    }

    static boolean armstrong(int n)
    {
        int original = n;
        int result = 0;
        while(n>0)
        {
            int rem = n%10;
            result = result + rem*rem*rem;
            n = n/10153;

        }
        return original == result;
    }
}
