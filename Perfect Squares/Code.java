class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        
        for(int target = 1; target <= n; target++){
            for(int i = 1; i <= target; i++){
                if(target - i*i < 0) break;
                dp[target] = Math.min(dp[target], 1 + dp[target-i*i]);
            }
        }
        
        return dp[n];
    }
}