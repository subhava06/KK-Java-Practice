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
        subhava.changeName("Shub");
        subhava.greeting();

       // Student[] students = new Student[5];
       // System.out.println(Arrays.toString(students));
      System.out.println();
       Student hero = new Student(21, "Shaktiman", 90.55f);
       System.out.println(hero.rollno);
       System.out.println(hero.name);
       System.out.println(hero.marks);
       hero.greeting();

       System.out.println();

       Student random = new Student(subhava);
       System.out.println(random.name);

       System.out.println();

       Student random2 = new Student();
       System.out.println(random2.name);
       System.out.println(random2.marks);

       System.out.println();

       Student one = new Student();
       Student two = one;
       one.name = "something something";
       System.out.println(two.name);


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
       // this is how you call a constructor from another constructor
       //internally: new Student(); a new object
       this(99, "Iron man", 100.00f);

    //  this.rollno= 13;
    //   this.name= "Subhava Ojha";
    //    this.marks = 87.6f;

       // the above "this" word will be replaced with the object name that we use
    }

    //Students arpit = new Student(16, "Arpit", 89.7f)
    // here, "this" will be replaced with arpit
    Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    //creating a constructor that takes values from another constructor
    Student(Student other) {
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;

    }
}