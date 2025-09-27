import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student subhava;
        Student[] students = new Student[5];
        
        System.out.println(Arrays.toString(students));
    }
}

class Student {

    int rollno ;
    String name;
    float marks; 
}