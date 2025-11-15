

public class PreOrderTraversal {
    //this is the main class

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();
        java.util.List<Integer> result = sol.preOrder(root);

        System.out.println("Preorder traversal");

        for(int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}




//Node structure for the BT

class Node {

    int data;
    Node left;
    Node right;

    //constructor
     Node(int val){
        data = val;
        this.left = null;
        this.right = null;
    }
}

 class Solution {
   

    public void preorder(Node root, java.util.List<Integer> arr) {


        //Preorder : Root -> left -> Right
        if(root == null) return;

        arr.add(root.data);

        preorder(root.left, arr);

        preorder(root.right, arr);
    }

    
    //func to initiate preorder traversal and return the resulting list
    public java.util.List<Integer> preOrder(Node root) {
         
        java.util.List<Integer> arr = new java.util.ArrayList<>();

        //call the preorder traversal func
        preorder(root, arr);

        //return the resulting list containing preorder traversal values
        return arr;
    }
}