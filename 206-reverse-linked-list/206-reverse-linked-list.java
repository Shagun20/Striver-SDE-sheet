/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //iterative solution
        
        
        ListNode cur, prev,next;
        
        prev=null;
        cur=head;
        
        while(cur!=null){
            
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        
        head=prev;
        
        return head;
        
        
    }
}