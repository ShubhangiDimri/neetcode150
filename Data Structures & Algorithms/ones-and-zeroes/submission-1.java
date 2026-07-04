class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp=new int[strs.length][m+1][n+1];

        for(int i=0;i<strs.length;i++){
            for(int j=0;j<=m;j++){
                for(int k=0;k<=n;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return helper(strs,m,n,0);
        
    }
    private int helper(String[] strs, int m, int n, int index){
        if(index==strs.length) return 0;
        String s= strs[index];

        int zeros=0;
        for(char c: s.toCharArray()){
            if(c=='0') zeros++;
        }
        int ones= s.length()-zeros;

         if (dp[index][m][n] != -1) return dp[index][m][n];

        int take=0;
        if(zeros<=m && ones<=n){
            take= 1+helper(strs, m-zeros, n-ones, index+1);
        }

        int skip= helper(strs,m,n, index+1);

        dp[index][m][n]= Math.max(take,skip);
        return dp[index][m][n];
    }
}