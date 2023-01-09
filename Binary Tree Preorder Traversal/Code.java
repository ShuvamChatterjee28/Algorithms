# Iterative

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> arr = new ArrayList<Integer>();
        
        Stack<TreeNode> rights = new Stack<TreeNode>();
        
        TreeNode node = root;
        
        while(node != null){
            arr.add(node.val);
            if(node.right != null) rights.push(node.right);
            node = node.left;
            if(node == null && !rights.isEmpty()) node = rights.pop();
        }
        
        return arr;
        
        //List<Integer> arr = new ArrayList<Integer>();
        //preOrder(arr, root);
        //return arr;
    }
    
    public void preOrder(List<Integer> array, TreeNode node){
        if(node != null) array.add(node.val);
        else return;
        preOrder(array, node.left);
        preOrder(array, node.right);
    }
}

# Recursive

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;
    }

    public void preorderTraversal(TreeNode root, List<Integer> list){
        if(root == null) { return; }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }
}
