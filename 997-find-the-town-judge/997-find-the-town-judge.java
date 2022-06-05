class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDeg = new int[n];
        
        for(int[] t : trust){
            inDeg[t[1] - 1]++;
            inDeg[t[0] - 1]--;
        }
        
        for(int i=0;i<n;i++){
            if(inDeg[i] == n-1){
                return i+1;
            }
        }
        return -1;
    }
}