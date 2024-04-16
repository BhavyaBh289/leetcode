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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode l = new TreeNode(val);
            l.left=root;
            return l;
        }
        if(depth==2){
            TreeNode l = root.left;
            TreeNode r = root.right;
            root.left=new TreeNode(val);
            root.left.left=l;
            root.right=new TreeNode(val);
            root.right.right=r;
            return root;
        }
        if(depth>2){
            if (root.left!=null){
                root.left=addOneRow(root.left,val,depth-1);
            }
            if(root.right!=null){
                root.right=addOneRow(root.right,val,depth-1);
            }
        }
        return root;
    }
}
