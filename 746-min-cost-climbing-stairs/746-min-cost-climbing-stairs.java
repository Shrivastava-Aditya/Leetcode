class Solution {
    public int topDown(int[] cost,int [] dp,int index){
        /*
        top down approach memoise the minimum(n-1,n-2) step + the cost of nth step;
        */
        if(index == 0 || index == 1)
            return cost[index];
        
        if(dp[index] != 0)
            return dp[index];
        
        dp[index] = Math.min(topDown(cost,dp,index-1),topDown(cost,dp,index-2))+cost[index];
        return dp[index];
        
    }
    
    public int bottomUp(int[] cost,int index){
        /*
        bottomUp approach will simply iterate from 2nd index to nth index and find minimum of n-1,n-2 index of dp array and add the cost of ith element and add in the dp array
            */
        int[] dp = new int[index+1];
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        if(dp[index] != 0)
            return dp[index];
        
        for(int i=2;i<index;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[index-1],dp[index-2]);
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int[] dp = new int[n+1];
        
        int topDownAnswer = Math.min(topDown(cost,dp,n-1),topDown(cost,dp,n-2));
        int bottomUpAnswer = bottomUp(cost,n);
        
        
        return bottomUpAnswer;
    }
     /*
     
     solution is in dp in fibonacci pattern 
     if(n ==  0 || 1) return cost[n]
     
     topDown = Math.min( topDown(cost,dp,n-1),topDown(cost,dp,n-2)) + cost[i];
     
     bottomUp {
     
     for(int i=2;i<n;i++){
     dp[i] = min(dp[i-1],dp[i-2])+cost[i];
     
     }
     return min(dp[n-2],dp[n-1])
     
     }
        
    */
}