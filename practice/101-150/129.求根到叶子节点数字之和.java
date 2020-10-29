/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return recursive(root,0);
    }
    public int recursive(TreeNode root,int subSum){
        if(root==null)return 0;
        int temp = subSum * 10 + root.val;
        if(root.left==null && root.right==null)
            return temp;
        return recursive(root.left,temp) + recursive(root.right,temp);
        
    }
    
}