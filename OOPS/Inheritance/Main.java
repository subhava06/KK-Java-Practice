//single inheritance
//multi level inheritance


public class Main {
    
    public static void main(String[] args) {
        
        Box  box = new Box(4.6, 7.9, 9.9);
       //  Box box2 = new Box(box1);

        System.out.println(box.l+" "+box.h+" "+box.w);

        BoxWeight box3 = new BoxWeight();
        box3.weight = 2;
        box3.h = 333;
        System.out.println(box3.weight+ " "+ box3.h);

        BoxWeight box4 = new BoxWeight(1.2,3.44,5.33,22.5);
        System.out.println(box4.h+" "+box4.w+" "+box4.weight+" "+box4.l);


        // NOTE: it is the type of the reference var(Box box5) and not the object(BoxWeight())
    // that determines what members can be accessed
    Box box5 = new BoxWeight(2, 5, 6, 7);
    System.out.println(box5.h+" "+box5.l+" "+box5.w+" ");


    //there are many variables in both parent and child classes
    // you are given access to variables that are in the ref type ,i.e, BoxWeight
    //hence you should have access to weight variable
    // this also means, that the ones you are trying to access should be initialized
    // but here, when the obj itself is of type parent class, how will u call the constructor
    // this gives an error because we are trying to reference a child to a parent
   // BoxWeight box6 = new Box(2,4,6); 
    }
}
