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
    public int maxDepth(TreeNode root) {
        //  root가 null 이면 depth = 0이다.
        // maxDepth를 구하는 것이기 때문에 가장 아래에 있는 값만 찾으면 됨
        // Math.max()메소드를 사용해서, left와 right중 더 큰 값만 구하자.
        // 재귀 메소드를 사용하자. 
        if (root ==null) return 0;
        if (root!=null && root.left==null && root.right==null) return 1;
        
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
        
    }
}