class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        
        if(Math.abs(target)>totalSum) return 0;

        if((totalSum+target)%2!=0) return 0;
        int sum= (totalSum+target)/2;

        int[][]  dp= new int[n+1][sum+1];

        dp[0][0]=1;
        // for(int j=1;j<=sum;j++){
        //     dp[0][j]=0;
        // } its already 0 by default in java

        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(nums[i-1]<=j){
                    dp[i][j]= dp[i-1][j]+ dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];




    }
}
