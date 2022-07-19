/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Node next=null;
        Node head=root;
        
        
        while(root!=null && root.left!=null){
            Node left=root.left;
            next=root.next;
            do{
               
                next=root.next;
                root.left.next=root.right;
                
                if(next!=null){
                    
                      root.right.next=next.left;
                      root=next;
                      
                }
               
                
            }
            while(next!=null);
            
            
            root=left;
        }
        
        
        return head;
    }
}