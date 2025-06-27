public class StackMain {
    
    public static void main(String[] args) {
        
        CustomStack stack = new CustomStack();
        stack.push(12);
        stack.push(13);
        stack.push(15);
        stack.push(9);
        stack.push(50);
        System.out.println(stack.push(24));
        
       try{
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
 


       }
       catch(StackException e)
       {
        System.out.println(e.getMessage());
       }
        

    }
}
