

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
    }
}
