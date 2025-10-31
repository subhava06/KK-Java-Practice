//find XOR of numbers in a given range 

public class LtoRXOR {
     
    public static void main(String[] args) {

        int N = 9;
        System.out.println(xorToRange(N));

        //from l to r
        int l = 4 , r =7;
        System.out.println(xorLToR(l,r));

    }

    public static int xorToRange(int n) {

        if(n % 4 == 1) return 1;
        else if(n % 4 == 2) return n+1;
        else if(n % 4 == 3) return 0;
        else return n;
    }

    public static int xorLToR(int l, int r){

        return xorToRange(l-1) ^ xorToRange(7);
    }
}
