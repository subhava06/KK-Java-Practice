
public class MissingNum {
    public static void main(String[] args) {
        
        int[] num = {1,2,4,5};
        int XOR1 =0;
        for(int i =1; i<=num.length+1; i++)
        {
            XOR1 = XOR1 ^ i;
        }
        int XOR2 = 0;
        for(int i=0; i<num.length;i++)
        {
            XOR2 = XOR2 ^ num[i];
        }

        System.out.println("missing number is :"+(XOR1 ^ XOR2));
    }
}
