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
    private int totalTilt = 0;
    public int findTilt(TreeNode root) {
        preOrderT(root);
        return totalTilt;
    }
    public int preOrderT(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftVal = preOrderT(root.left);
        int rightVal = preOrderT(root.right);

        totalTilt += Math.abs(leftVal-rightVal);

        return root.val+leftVal+rightVal;
    }
}