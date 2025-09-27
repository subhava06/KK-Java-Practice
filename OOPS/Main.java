import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student subhava= new Student();

        subhava.rollno = 69;

        System.out.println(subhava.rollno);
        System.out.println(subhava.name);
        System.out.println(subhava.marks);
        subhava.greeting();

        Student kunal = new Student();
        kunal.name = "Kunal";
        kunal.greeting();

        subhava.changeName("Car lover");
        subhava.greeting();

       // Student[] students = new Student[5];
       // System.out.println(Arrays.toString(students));
    }
}

class Student {

    int rollno ;
    String name;
    float marks = 90.0f; 

    void greeting() {
        System.out.println("Hello! my name is "+this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    //we need a way to add the values of above properties object by object
    //we need one word to access every object

    //constructor
    Student() {
     this.rollno= 13;
      this.name= "Subhava Ojha";
       this.marks = 87.6f;

       // the above "this" word will be replaced with the object name that we use
    }
}