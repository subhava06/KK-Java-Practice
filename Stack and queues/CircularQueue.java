// In circular queue, insertion and removal takes O(1) time

public class CircularQueue  {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;
    int end = 0; int front =0; int size = 0; // needed to check full and empty condn

    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size)
    {
        this.data = new int[size];
    }

    //Empty check
    public boolean isEmpty()
    {
        return size==0;
    }
    //Full check
    public boolean isFull()
    {
        return size==data.length;
    }

    //Insertion
    public boolean insert(int item)
    {
        if(isFull()) {
            System.out.println("Queue is full,can`t enqueue more!");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    // removal
    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty, can`t dequeue more!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    // peek at front element
    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty, nothing to display!");
        }
        return data[front];
    }

    //display 
    public void display() {
        if(isEmpty()) {
            System.out.println("Nothing to show");
            return;
        }

        int i= front;
        do{
            System.out.print(data[i]+"->");
            i++; 
            i= i % data.length;
        }while(i != end);
        System.out.println("end");
    }
    

}
