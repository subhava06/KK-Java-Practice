public class WrapperExample {
    
    public static void main(String[] args) {
        
        int a =10;
        int b= 20;


        Integer num=45;
        swap(10,20);
        System.out.println("It won't swap as in java only values are passed");
        System.out.println(a+" "+b);
        //instead use Integer object, then it will pass and swap
        Integer p = 20;
        Integer q = 30;
        System.out.println("Now it will swap");
        swap(p,q);
        System.out.println(p+" "+q);


    }
    public static void swap(Integer a , Integer b)
    {
        int temp =a;
        a = b;
        b = temp;
    }
}

public class A {
    final int a = 2;
    // always initialize a final var while declaring it.

}
