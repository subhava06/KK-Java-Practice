import java.util.ArrayList;
import java.util.List;

// *********************************************************************************************************************//
  // Print all subsequences where sum =k 
// ********************************************************************************************************************//

public class Prac2 {

    public static void func(int ind, List<Integer> current, int[] arr, int sum, int targetSum)
    {
      //  List<Integer> current = new ArrayList<>();
        
        if(ind == arr.length)
          {
            if(sum == targetSum) 
              System.out.println(current);

            return;  
          }

        current.add(arr[ind]);
        
        func(ind+1,current,arr,sum + arr[ind],targetSum);

        //backtrack and remove the elem
        current.remove(current.size()-1);
        
        func(ind+1,current,arr,sum,targetSum);

    }

    public static void main(String[] args)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1,2,1};
        int targetSum = 2;
        List<Integer> current  = new ArrayList<>();

        func(0,current,arr,0,targetSum);

    }
}
