public class LL {
    
    private Node head; // creating different instances of the class Node
    private Node tail;
    private int size;
   public LL()
   {
    this.size = 0;
   }
     
   // Insert first node to the LL
   public void insertFirst(int value)
   {
     //create an instance of the first node
     Node node = new Node(value);
     node.next = head;
     head = node; // now head points to this node as its the first node
     
     if(tail == null) // this means first element of LL is added
     {
        tail = head; // then update tail also 
     }
     size += 1;
   }

   //insert at last
   public void insertLast(int val){
    if(tail==null){
      insertFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
   }

   //To insert at a given index
   public void insert(int value, int index)
   {
    if(index == 0) {
      insertFirst(value);
      return;
    }
    if(index == size){
      insertLast(value);
      return;
    }

    //Create a temp node and traverse till the index of insertion
    Node temp = head; //initially at index 0
    for(int i =1; i<index;i++){
      temp = temp.next;
    }

    //create the node to insert
    Node node = new Node(value,temp.next);
    temp.next = node;

    size++;

   }

   // Delete at first
   public int deleteFirst()
   {
    int val = head.value;
    head = head.next; // to delete means just point the head one node ahead
    size --;
    return val;
   }

   //delete at last
   public int deleteLast()
   {
    if(size<=1) {
      return deleteFirst();
    }
    Node secondLast = get(size -2); //pointing to second last
    int value = tail.value;
    tail = secondLast;
    tail.next = null;
    return value;

   }

   //delete from anywhere
   public int delete(int index)
   {
    if(index == 0) {
      return deleteFirst();
    }
    if(index == size-1){
      return deleteLast();
    }
    Node prev = get(index-1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    return val;
   }

   //get secondLast node 
   public Node get(int index)
   {
    Node node = head;
    for(int i =0;i<index;i++)
    {
      node = node.next;
    }
    return node;
   }

   //find a value in LL
   public Node find(int value)
   {
    Node node = head;
    while(node != null)
    {
      if(node.value == value)
      {
        return node;
      }
      node = node.next;
    }
    return null; // if desired value not found
   }

   // display 
   public void display()
   {
     Node temp = head; 
     while(temp != null)
     {
        System.out.print(temp.value + " -> ");
        temp = temp.next; //completely changes value of temp to next node
     }
     System.out.println("End");
   }

    private class Node {
       private int value;
       private Node next;

       public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}