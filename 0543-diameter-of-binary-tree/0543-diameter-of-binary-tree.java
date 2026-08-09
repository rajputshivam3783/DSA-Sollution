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
    static int maxDia;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int levelsLST= levels(root.left);
        int levelsRST= levels(root.right);
        int dia= levelsLST + levelsRST;
        maxDia= Math.max(dia, maxDia);
        return 1 + Math.max(levelsLST, levelsRST);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia=0;
        levels(root);
        return maxDia;
    }
}