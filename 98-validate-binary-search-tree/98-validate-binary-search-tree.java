/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//O(n) approach
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root, long min, long max){
        
        if(root==null)
            return true;
        if(min<root.val && root.val<max){
           return helper(root.left,min ,(long)root.val) && helper(root.right, (long)root.val,max);
            
        }
        
        return false;
    }
}