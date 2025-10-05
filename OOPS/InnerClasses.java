// eg to show classes inside a class


 
public class InnerClasses {

    // now the class Test does not depend upon the objects of the outer class
    static class Test { // only inner classes can be static not outer one

        String name;

        public Test(String name)
        {
            this.name = name;
        }
    }
    
    

        public static void main(String[] args) {
            Test a = new Test("Kunal");
            Test b = new Test("Rahul");
        
            System.out.println(a.name);
            System.out.println(b.name);
        }
    }



// static class A {

// }

// note: Static level stuff are Class level stuff
// they are initialized at compile time
//unlike objects that are created at compile time
