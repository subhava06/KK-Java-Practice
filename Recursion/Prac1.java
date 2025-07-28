

public class Prac1 {

    //functional recursion
    public static int func1(int n)
    {
        if(n==0)
          return 0;
        return n + func1(n-1);
    }
    //parameterised recursion
    public static void func2(int i, int sum)
    {
        if(i<1)
        {
          System.out.println(sum);
          return ;
        }
        
        func2(i-1,sum+i);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(func1(n));
        func2(n,0);
    }
    
}
