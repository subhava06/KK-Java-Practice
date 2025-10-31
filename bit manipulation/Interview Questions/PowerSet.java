// print all power sets

import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet {
    
    public static void main(String[] args) {
        
         //return a list of all the subsets(list) of subsets
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

       // Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3};
        int n = nums.length;


        //check for all the subsets,i.e, 2^n
        int subsets = 1<<n;

        
        for(int i =0; i<=subsets-1; i++){
            ArrayList<Integer> list = new ArrayList<>();
           // int cnt =0;
            // check if j-th bit of i is set
            for(int j=0; j<n; j++) {
               
                //if the index is set only then add elem of that index
                if((i & (1<<j))!=0) {
                    list.add(nums[j]);  
                    //cnt++; 
                }
                //System.out.println(cnt);
            }
            ans.add(list);
        }
        System.out.println(ans);
        //System.out.println("count "+cnt);
    }
}
