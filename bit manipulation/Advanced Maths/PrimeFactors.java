// print all the prime factors of a number

import java.util.ArrayList;

public class PrimeFactors {

    public static void main(String[] args) {
        
        int n = 37;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =2; i<=Math.sqrt(n); i++)
        {
            if( n%i == 0){
               list.add(i);
               while(n%i==0) n = n/i;
            }
        }
        if(n !=1 ) list.add(n);
        System.out.println(list);
    }
    
}
