class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, 0, map, 1);
        
        for(ArrayList<Integer> arr: map.values()){
            ans.add(arr.get(0));
        }
        
        return ans;
    }
    
    public void helper(Node root, int HD, TreeMap<Integer, ArrayList<Integer>> map, int height){
        if(root == null) { return; }
        helper(root.left, HD-1, map, height+1);
        
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(root.data);
        temp.add(height);
        if(map.containsKey(HD)){
            if(map.get(HD).get(1)<=height){
                map.put(HD, new ArrayList<>(temp));
            }
        }
        else{
            map.put(HD, new ArrayList<>(temp));   
        }
        
        helper(root.right, HD+1, map, height+1);
    }
}