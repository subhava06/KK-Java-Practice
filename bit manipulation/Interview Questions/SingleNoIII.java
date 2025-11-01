//find the numbers appearing odd no. of times
import java.util.ArrayList;
public class SingleNoIII {
    
    public static void main(String[] args) {
        
        int[] nums = {2,4,2,14,3,7,7,3};
        ArrayList<Integer> ans  = new ArrayList<>();

        long XORR = 0; // find xor of all the elements of the array

        for(int i =0; i<nums.length; i++){
            XORR = XORR ^ nums[i];
        }

        //find the rightmost bit
        int rightmost = (int)(XORR & -(XORR));
        
        //take two buckets b1 and b2 
        //again traverse the loop and distinct sinble no.s will go in diff buckets
        int b1=0, b2 =0;
        for(int i=0; i<=nums.length-1; i++)
        {
            if((nums[i] & rightmost)==0) 
            {
            b1^=nums[i];
        }
            else b2^=nums[i];
        }
        ans.add(b1);
        ans.add(b2);
        
        System.out.println(ans);

    }
}
