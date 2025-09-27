import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student subhava;
        subhava = new Student();
        subhava.rollno= 1;
        subhava.name= "Subhava Ojha";
       subhava.marks = 87.6f;
        System.out.println(subhava.rollno);
        System.out.println(subhava.name);
        System.out.println(subhava.marks);

       // Student[] students = new Student[5];
       // System.out.println(Arrays.toString(students));
    }
}

class Student {

    int rollno ;
    String name;
    float marks = 90.0f; 
}