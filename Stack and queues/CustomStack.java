

public class CustomStack {
    
    protected int[] data;
    private static final int default_size = 10;
    int ptr = -1;

    // for stack with default size
    public CustomStack() {
        this(default_size);
    }
     
    //for own custom stack
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr ==-1;
    }

    //push
    public boolean push(int item)
    {
        if(isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    //pop 
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty, can`t pop");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    //peek
    public int peek(int item) throws StackException
    {
         if(isEmpty()) {
            throw new StackException("Nothing to show, empty!");
         }
         return data[ptr];
    }

    


}
