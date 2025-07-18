import java.util.*;

public class SubArrays {
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        //input array
        int[] num = new int[5];
        int n = num.length;
        System.out.println("Enter the array");
        for(int i=0; i<n;i++)
        {
            num[i] = sc.nextInt();
        }

        List<List<Integer>> result =  getSubArray(num);

        System.out.println("The list of subarrays is as follows");
        for(List<Integer> sub: result){
            System.out.print(sub+" ");
        }
        System.out.println();

    }


    //function to return all subarrays as a list of arrays
        public static List<List<Integer>> getSubArray(int[] num)
        {
            int n = num.length;
            List<List<Integer>> subArr = new ArrayList<>();
            for(int start =0 ; start<n;start++)
            {
                for(int end = start; end<n; end++)
                {
                    List<Integer> sub = new ArrayList<>();
                    for(int k = start; k<=end;k++)
                    {
                        sub.add(num[k]);
                    }
                    subArr.add(sub);
                }
            }
            return subArr;
        }


}
