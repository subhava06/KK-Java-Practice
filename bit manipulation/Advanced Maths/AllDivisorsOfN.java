// print all divisors of N

import java.util.ArrayList;

public class AllDivisorsOfN {

    public static void main(String[] args) {
        
        int N = 12;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i<= Math.sqrt(N); i++)
        {
             if(N%i==0) {
                list.add(i);
             }
             if(N/i !=i) list.add(N/i);
        }
        System.out.println(list);
    }
    
}
