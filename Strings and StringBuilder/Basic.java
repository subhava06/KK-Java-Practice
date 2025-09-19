import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        String name = "Subhava Ojha";
     //   System.out.println(name);

        String b = name;
      //  System.out.println(name == b);

       // String c = new String("Subhava Ojha");
       // System.out.println(c==b);
       // System.out.println(c.equals(b));

       System.out.println(Arrays.toString(new int[]{1,2,3,4}));

       //primitive datatypes could not use .toString method 
       //but Wrapper classes could
       Integer num = new Integer(56);
       System.out.println(num.toString());



    }
}