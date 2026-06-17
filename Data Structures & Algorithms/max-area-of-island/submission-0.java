class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis= new boolean[m][n];

        int maxArea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    maxArea= Math.max(maxArea,dfs(grid,vis,i,j,m,n));
                }
            }
        }
        return maxArea;

    }
    private int dfs(int[][] grid, boolean[][] vis, int i, int j, int m, int n){
        vis[i][j]=true;
        int area=1;
        int[][] dirs={{0,-1},{0,1},{1,0},{-1,0}};
        for(int k=0;k<4;k++){
            int newi=i+dirs[k][0];
            int newj= j+dirs[k][1];
             if(newi>=0 && newi<m &&
               newj>=0 && newj<n &&
               grid[newi][newj]==1 &&
               !vis[newi][newj]){
                area += dfs(grid,vis,newi,newj,m,n);
            }
        }
        return area;
    }
}
