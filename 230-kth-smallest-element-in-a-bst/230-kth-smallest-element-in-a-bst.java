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
class Solution {
    
    int count=0;
    int ans=-1;
    
    public int kthSmallest(TreeNode root, int k) {
        
        helper(root, k);
        
        return ans;
        
    }
    
    public void helper(TreeNode root, int k){
        
        if(ans!=-1 || root==null){
            return;
        }
        
        helper(root.left, k);
        count++;
        if(k==count){
            ans=root.val;
        }
        
        helper(root.right,k);
    }
        
}