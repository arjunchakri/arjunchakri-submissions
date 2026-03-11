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

    private int RESULT = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        traceDiameter(root);
        return RESULT;
    }

    private int traceDiameter(TreeNode current) {
        if(current == null) {
            return 0;
        }
        int lHeight = traceDiameter(current.left);
        int rHeight = traceDiameter(current.right);
        RESULT = Math.max(RESULT, lHeight + rHeight);
        return 1 + Math.max(lHeight, rHeight);
    }
}