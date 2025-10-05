package singleton;
public class Singleton {
    // It is a class which could only have one object of it
    //for that one should avoid others to make constructors of it

    private int num =0;
    private Singleton() {
        
    }

    private static Singleton instance;

    public static Singleton getInstance() {
         //check whether 1 object only is created or not
         
         if(instance == null) {
            instance = new Singleton();
         }

         return instance;
    }

}
