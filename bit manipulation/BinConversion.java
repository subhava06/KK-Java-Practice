// bin to decimal and vice versa conversion

public class BinConversion {

    public static void main(String[] args) {
        

        //swap two numbers
        int a = 5, b = 6;
        System.out.println("before swap: "+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap: "+a+" "+b);
    
    }
    
}
