class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int total=0;
        for(int stone: stones){
            total+=stone;
        }
        boolean[][] dp= new boolean[n+1][total+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=total;j++){
                if(stones[i-1]<=j){
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-stones[i-1]];

                }else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<=total/2;j++){
            if(dp[n][j]==true){
                int sum1= j;
                int sum2= total-j;
                min=Math.min(min, Math.abs(sum1-sum2));

            }
        }
        return min;

    }
}