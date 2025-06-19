public class CLL {
    
    Node head;
    Node tail;

    // insertion
    public void insert(int val)
    {
       Node node = new Node(val);
       if(head == null)
       {
        head = node;
        tail = node;
       }
       tail.next = node;
       node.next = head;
       tail = node;
    }

    public void display()
    {
        Node node = head;
        
        if(head != null)
        {
            do{
              System.out.print(node.val+" ->");
              node = node.next;
            }
            while(node!=head);
        }
        System.out.println(" Head");
    }

    // delete a value
    public void delete(int val)
    {
        Node node = head;

        if(node == null) //Case 1: when node with that value DNE
        {
            return;
        }

        // Case 2: if val is present at the head 
        if(node.val == val)
        {
            head= node.next;
            tail.next = head;
            return;
        }
        //Case 3: Val is at some node, traverse using do...while
        do{
            Node n = node.next;
            if(n.val == val)
            {
                node.next = n.next;
                break;
            }
            node = node.next; // otw, keep traversing
        } while(node != head);
    }



    private class Node {
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }
    }
}
