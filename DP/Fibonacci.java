import java.util.Arrays;

public class Fibonacci {

    static int[] dp;
    // Memoization technique
    public static int func1(int n) 
    {
        if(n <= 1)
          return n;
        
        if(dp[n] != -1) return dp[n];
        return dp[n] = func1(n-1) + func1(n-2);
    }

    // Tabulation method
    public static void func2(int n)
    {
        dp[0] =0;
        dp[1] = 1;
        for(int i =2; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }

    //optimised SC of tabulation method
    public static int func3(int n)
    {
        int prev =1;
        int prev2 = 0;
        int curri;
        for(int i =2; i<=n;i++)
        {
            curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }


    public static void main(String[] args)
    {
        int n = 5;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
       System.out.println(func1(n));
       func2(n);
       System.out.println(func3(n));
    }
    
}
