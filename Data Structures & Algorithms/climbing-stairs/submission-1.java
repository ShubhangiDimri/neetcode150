class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp= new int[n+1];
        return solve(n);
    }
     public int solve(int n) {
        if (n == 1 || n == 2) return n;

        if (dp[n] != 0)
            return dp[n];

        int x = solve(n - 1);
        int y = solve(n - 2);

        return dp[n] = x + y;
    }
}

