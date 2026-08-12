// Last updated: 8/12/2026, 12:03:06 PM
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
    private int dc=0;
    public int countDominantNodes(TreeNode root) {
        dc=0;
        fmc(root);
        return dc;
    }

    private int fmc(TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }

        int lm = fmc(node.left);
        int rm = fmc(node.right);

        int cm = Math.max(node.val, Math.max(lm, rm));

        if(node.val == cm) {
            dc++;
        }
        return cm;
    }
}