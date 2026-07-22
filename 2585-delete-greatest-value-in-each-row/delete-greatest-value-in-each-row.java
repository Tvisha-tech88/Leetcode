class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans =0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i=0; i<rows; i++){
            Arrays.sort(grid[i]);
        }

        for(int i=0; i< cols; i++){
            int max =0;
            for(int j=0; j<rows; j++){
                max = Math.max(max, grid[j][i]);
            }
            ans += max;
        }

        return ans;
        
    }
}