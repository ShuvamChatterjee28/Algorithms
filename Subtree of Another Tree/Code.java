class Solution {
    boolean isSimilar = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) { return false; }
        if(isSimilarTree(root, subRoot)){ return true; }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSimilarTree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){ return true; }
        if(root == null || subRoot == null){ return false; }
        if(root.val != subRoot.val){ return false; }
        else{
            return isSimilarTree(root.left, subRoot.left) && isSimilarTree(root.right, subRoot.right);
        }
    }
}