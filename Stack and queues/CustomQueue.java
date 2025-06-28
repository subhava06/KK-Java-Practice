// FIFO
public class CustomQueue {
    private int[] data ;
    private static final int DEFAULT_SIZE = 10;
    int end = 0 ; //pointer to insert and remove items from queue

    //constrctor 1
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    //constructor 2
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }

    // empty check
    public boolean isEmpty(){ 
            return end==0;     
    }
    // full check
    public boolean isFull() {
        return end==data.length;
    }

    //insert 
    public boolean insert(int item)
    {
        if(isFull()){
            System.out.println("Queue is full, can`t insert more !");
            return false;
        }
        data[end++] = item;
        return true;
    }

    //remove 
    public int remove() throws Exception{
        if(isEmpty()) {
            throw new Exception("Queue is empty, can`t remove more");
        }
        int removed = data[0];
        for(int i=1;i<end;i++)
        {
            data[i-1] = data[i]; 
        }
        end--;
        return removed;
    }

    //display front item
    public int front() throws Exception{ 
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    //display all items
    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+" <-");
        }
        System.out.println("end");
    }

}
