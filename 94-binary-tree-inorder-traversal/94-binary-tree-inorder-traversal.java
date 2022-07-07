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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans=new ArrayList<>();
        inorder(root, ans);
        return ans;
      
        
    }
    public void inorder(TreeNode root, List<Integer> ans){
        //fill in the list by reference only
        if(root==null)
            return;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
        
        
    }
}