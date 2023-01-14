class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int max = 0;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    max = Math.max(max, maxArea(grid, visited, i, j));
                }
            }
        }
        
        return max;
    }
    
    public int maxArea(int[][] grid, boolean[][] visited, int r, int c){
        if(r>=grid.length || r<0 || c>=grid[0].length || c<0) return 0;
        if(visited[r][c] || grid[r][c] == 0) return 0;    
        
        visited[r][c] = true;
        
        return grid[r][c]+maxArea(grid, visited, r+1, c)+maxArea(grid, visited, r-1, c)+maxArea(grid, visited, r, c+1)+maxArea(grid, visited, r, c-1);
    }
}