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
    public int levels(TreeNode root, boolean [] ans){
        if(root==null) return 0;
        int levelsLST= levels(root.left, ans);
        int levelsRST= levels(root.right, ans);
        int diff=Math.abs(levelsLST - levelsRST);
        if(diff >1) ans[0]=false;
        return 1 + Math.max(levelsLST, levelsRST);
    }
    public boolean isBalanced(TreeNode root) {
        boolean [] ans={true};
        levels(root, ans);
        return ans[0];
    }
}