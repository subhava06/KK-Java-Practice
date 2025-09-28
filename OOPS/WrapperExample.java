public class WrapperExample {
    
    public static void main(String[] args) {
        
        int a =10;
        int b= 20;


       // Integer num=45;
       // swap(10,20);
        System.out.println("It won't swap as in java only values are passed");
        System.out.println(a+" "+b);
        //instead use Integer object, then it will pass and swap
        Integer p = 20;
        Integer q = 30;
        System.out.println("Now also it wont swap");
        //swap(p,q);
        System.out.println(p+" "+q);

        A subhava = new A("Subhava");
        subhava.name = "other name"; // this is allowed with final objects
        //but below is not allowed
        // when a non primitive is final, you cannot reassign it
        //subhava = new A("new object");
        
        


    }
   
}

public class A {
    final int a = 2;
    // always initialize a final var while declaring it.
    String name;

    public A(String name) {
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        // TODO Auto-generated method stub
//        System.out.println("Object is destroyed");
//    }

}
