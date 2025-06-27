public class DynamicStack extends CustomStack {
    // this stack would never get full 
    public DynamicStack()
    {
        super(); // it will call CustomStack constructor
    }
    public DynamicStack(int size)
    {
        super(size); // it will call CustomStack(int size)
    }

    // new push
    public boolean push(int item)
    {
        if(isFull()) {
            //increase size of stack
            int[] temp = new int[data.length *2];

            //now copy all items of data into temp
            for(int i=0;i<data.length-1;i++)
            {
                temp[i] = data[i];
            }
            //update data
            data = temp;
        }
        return super.push(item);
        
    }
}
