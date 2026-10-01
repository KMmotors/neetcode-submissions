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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list.get(k-1);
    }
    private static void inOrder(TreeNode node,List<Integer>res){
        if(node==null) return ;
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);
    }
}
