class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root.left!=null){
            TreeNode l=root.left;
            if(l.left==null&&l.right==null){
                sum+=l.val;
            }
            sum+=sumOfLeftLeaves(l);
        }
        if(root.right!=null){
            sum+=sumOfLeftLeaves(root.right);
        }
        return sum;
    }
}
