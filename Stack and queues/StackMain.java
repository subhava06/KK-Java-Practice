public class StackMain {
    
    public static void main(String[] args) {
        
    //     CustomStack stack = new CustomStack();
    //     stack.push(12);
    //     stack.push(13);
    //     stack.push(15);
    //     stack.push(9);
    //     stack.push(50);
    //     System.out.println(stack.push(24));
        
    //    try{
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
 


    //    }
    //    catch(StackException e)
    //    {
    //     System.out.println(e.getMessage());
    //    }

    // DynamicStack stack = new DynamicStack(4);
    //     stack.push(22);
    //     stack.push(34);
    //     stack.push(77);
    //     stack.push(99);
    //     stack.push(103);
    //     System.out.println(stack.push(124)); // no stack overflow as size of stack got doubled

    //     // pop and print the items
    //     while(!stack.isEmpty())
    //     {
    //         try {
    //         System.out.println(stack.pop());

    //         }
    //         catch(Exception e)
    //         {
    //             System.out.println(e.getMessage());
    //         }
    //     }
    
//     CustomQueue queue = new CustomQueue(4);
//     queue.insert(12);
//     queue.insert(14);
//     queue.insert(15);
//     queue.insert(45);
//    // System.out.println(queue.insert(22));
 
//     queue.display();
//     try{
//         System.out.println(queue.remove());
//         System.out.println(queue.remove());
//     }
//     catch(Exception e){
//               System.out.println(e.getMessage());
//     }
//     queue.display();
//     try{
//         System.out.println(queue.remove());
//         System.out.println(queue.remove());
//         System.out.println(queue.remove());
//     }
//     catch(Exception e) {
//         System.out.println(e.getMessage());
//     }
//     queue.display();
    
     CircularQueue queue = new CircularQueue(4);
     queue.insert(12);
     queue.insert(13);
     queue.display();
     queue.insert(14);
     queue.insert(15);
     queue.display();
     queue.insert(17);
     queue.display();
     try{
        System.out.println(queue.remove());
        queue.insert(17);
     }
     catch(Exception e) {
        System.out.println(e.getMessage());
     }
     queue.display();

    }
}
