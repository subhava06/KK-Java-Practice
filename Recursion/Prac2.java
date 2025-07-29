import java.util.ArrayList;
import java.util.List;

// *********************************************************************************************************************//
  // Print all subsequences where sum =k 
  // Print only one subsequence
  // print no. of such subsequences
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

    public static boolean func2(int ind, int sum, int targetSum, int[] arr, List<Integer> current)
    {
        if(ind == arr.length)
        {
            if(sum == targetSum)
            {
                System.out.println(current);
              return true;
            }
            return false;
        }

        //pick element
        current.add(arr[ind]);
        if(func2(ind+1, sum+arr[ind], targetSum, arr, current)) return true;

        //don`t pick element
        current.remove(current.size()-1);
        if(func2(ind +1 , sum, targetSum, arr, current)) return true;

        return false;
    }

    public static int func3(int ind, int sum, int targetSum, int[] arr)
    {
        
           if(ind == arr.length)
           {
             return sum == targetSum ? 1 : 0;
           }

           int left = func3(ind+1, sum + arr[ind], targetSum, arr); //with current elem
           int right = func3(ind+1, sum, targetSum, arr); // w/o current elem
           return left + right;
    }

    public static void main(String[] args)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1,2,1};
        int targetSum = 2;
        List<Integer> current  = new ArrayList<>();

        func(0,current,arr,0,targetSum);
        System.out.println(" new line");
        func2(0,0,targetSum,arr,current);
        System.out.println("new line");
        System.out.println(func3(0,0,targetSum,arr)); // to print no. of subsequences

    }
}
