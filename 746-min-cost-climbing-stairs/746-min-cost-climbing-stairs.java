class Solution {
    public int topDown(int[] cost,int [] dp,int index){
        if(index == 0)
            return cost[0];
        if(index == 1)
            return cost[1];
        
        if(dp[index] != 0)
            return dp[index];
        
        dp[index] = Math.min(topDown(cost,dp,index-1),topDown(cost,dp,index-2)) + cost[index];
        
        return dp[index];
        
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int[] dp = new int[n+1];
        
        int res = Math.min(topDown(cost,dp,n-1),topDown(cost,dp,n-2));
        
        return res;
    }
}