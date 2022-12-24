class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] isVisited = new boolean[rooms.size()];
        dfs(0, rooms, isVisited);
        for(int i = 0; i < isVisited.length; i++){
            if(isVisited[i] == false) { return false; }
        }
        return true;
    }

    public void dfs(int idx, List<List<Integer>> rooms, boolean[] isVisited){
        if(isVisited[idx] == true) { return; }
        isVisited[idx] = true;
        List<Integer> temp = rooms.get(idx);
        for(int i = 0; i < temp.size(); i++){
            dfs(temp.get(i), rooms, isVisited);
        }
    }
}