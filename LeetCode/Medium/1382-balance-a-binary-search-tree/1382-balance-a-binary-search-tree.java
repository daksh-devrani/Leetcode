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
    private void inorder(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    // Step 2: Build balanced BST from sorted array
    private TreeNode buildBalanced(List<Integer> arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr.get(mid));

        root.left = buildBalanced(arr, start, mid - 1);
        root.right = buildBalanced(arr, mid + 1, end);

        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        
        inorder(root, arr);  // Step 1
        
        return buildBalanced(arr, 0, arr.size() - 1);  // Step 2
    }
}