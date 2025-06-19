public class Main {
    public static void main(String[] args) {
        // LL list = new LL(); // created instance of LL class

        // list.insertFirst(3);
        // list.insertFirst(7);
        // list.insertFirst(8);
        // list.insertFirst(15);

        // list.insertLast(99);

        // //inserting at a particular index
        // list.insert(1000,3);
        // list.insert(333,6);

        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();
        // System.out.println(list.find(3));

        // DLL list = new DLL(); // created instance of LL class

        // list.insertFirst(30);
        // list.insertFirst(70);
        // list.insertFirst(80);
        // list.insertFirst(150);
        // list.insertLast(2000);
        // list.insert(80,1);
        // list.display();

        CLL list = new CLL();

        list.insert(20);
        list.insert(21);
        list.insert(22);
        list.insert(23);
        list.insert(24);
        list.insert(25);

        list.display();
        list.delete(23);
        list.display();
       

        

    }

   
}
