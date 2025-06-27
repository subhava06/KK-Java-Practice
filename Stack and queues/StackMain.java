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

    DynamicStack stack = new DynamicStack(4);
        stack.push(22);
        stack.push(34);
        stack.push(77);
        stack.push(99);
        stack.push(103);
        System.out.println(stack.push(124)); // no stack overflow as size of stack got doubled

        // pop and print the items
        while(!stack.isEmpty())
        {
            try {
            System.out.println(stack.pop());

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }


        

    }
}
