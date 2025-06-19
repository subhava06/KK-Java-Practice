public class DLL {
     
    private Node head;
    

    //insert at first
    public void insertFirst(int val)
    {
        Node node =new Node(val); //create the box
        node.next = head;
        node.prev = null;
        if(head != null) 
            head.prev = node;
        head = node; // head now points to new node as it is the first elem
    }

    //display
    public void display()
    {
        //create a temporary node for traversal
        Node node = head; //initially it points to head
        Node last = null; // for backward transition
        while(node != null)
        {
            System.out.print(node.val+" -> ");
            last = node; // keep track of last node
            node = node.next; //reassigning node to next val
        }
        System.out.println("null");

        //reverse print
        System.out.println("Reverse print");
        while(last != null) // here the loop won`t run unless we track the last node and point it to actual last
        {
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("start");
    }
    
    // Insert at end (w/o tail node)
    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node last = head; // last is used to traverse till the end
        node.next = null; // irrespectively
        if(head == null)
        {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next !=null)
        {
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }

    //find a particular value in DLL
    public Node find(int val)
    {
        Node node = head;
    while(node != null)
    {
        if(node.val == val)
        {
            return node;
        }
        node = node.next;
    }
    return null;
    }

// Insertion after a particular value
public void insert(int after, int val)
{
    Node p = find(after);
    if(p==null)
      {
        System.out.println("Does not exist");
        return;
      }
    Node node = new Node(val);
    node.next = p.next;
    node.prev = p;
    p.next = node;
    if(node.next != null)
    {
        node.next.prev = node; //is node ke next node ka prev ab ye new node hoga
    }
   // return;
    
}

















    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val)
        {
             this.val = val;
        }
        public Node(int val,Node next, Node prev)
        {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
