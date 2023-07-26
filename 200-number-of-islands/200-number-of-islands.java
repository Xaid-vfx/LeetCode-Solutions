class Solution {
    public boolean helper(char[][] grid, int row, int col, int result){
        if( col < 0 || row < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != '1') 
            return false;
        grid[row][col] = '#';
        helper(grid, row + 1, col, result);
        helper(grid, row, col + 1, result);
        helper(grid, row - 1, col, result);
        helper(grid, row, col - 1, result);
        return true;
    }
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++)
                if(helper(grid, i, j, result))
                    result++;

        return result;
    }
}