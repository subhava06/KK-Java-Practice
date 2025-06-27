
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(22);
        stack.push(50);
        stack.push(60);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


     Queue<Integer> queue = new LinkedList<>();
          
       queue.add(3);
       queue.add(6);
       queue.add(5);
       queue.add(9);
       queue.add(1);

    //    System.out.println(queue.peek());
    //    System.out.println(queue.remove());
    //    System.out.println(queue.remove());

       Deque<Integer> deque = new ArrayDeque<>();

       deque.add(89);
       deque.addLast(57);
       System.out.println(deque.removeLast());

    }
}
