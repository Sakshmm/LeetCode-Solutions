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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or we find either p or q, return root
        if (root == null || root == p || root == q) {
            return root;
        }
        
        // Recursively search in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // If both left and right return non-null, p and q are in different subtrees
        // Therefore, the current root is their lowest common ancestor
        if (left != null && right != null) {
            return root;
        }
        
        // Otherwise, return whichever subtree found one of the nodes (or null if neither did)
        return left != null ? left : right;
    }
}