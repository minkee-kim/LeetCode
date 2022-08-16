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
    // left는 right이 되고, right은 left가 되야한다.
    //root가 null이면 바로 종료
    // 1번 root는 헤드로 한다.
    // 재귀로 풀자 왜냐하면 계속해서 left와 right이 바뀌는 것이 반복되기 때문에
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode head =  new TreeNode(root.val);
        head.left = invertTree(root.right);
        head.right = invertTree(root.left);
          return head;  
        }       
        
    
    }
