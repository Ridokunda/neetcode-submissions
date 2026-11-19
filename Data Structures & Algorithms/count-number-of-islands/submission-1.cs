public class Solution {
    public int NumIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.Length; i++){
            for(int j = 0; j < grid[0].Length; j++){
                if(grid[i][j] == '1'){
                    
                    dfs(grid, i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.Length || col < 0 || col >= grid[0].Length || grid[row][col] == '0'){
            return;
        }
        
        grid[row][col] = '0';
        dfs(grid,row+1,col);
        dfs(grid, row, col+1);
        dfs(grid, row-1,col);
        dfs(grid, row,col-1);
    }
}
