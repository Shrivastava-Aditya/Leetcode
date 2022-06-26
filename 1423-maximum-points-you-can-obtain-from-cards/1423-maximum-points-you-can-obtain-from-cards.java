class Solution {
    public int maxScore(int[] cardPoints, int k) {
       
        int n = cardPoints.length,lscore = 0;
        
        for(int i=0;i<k;i++){
            lscore+=cardPoints[i];
        }
        int max = lscore,rscore = 0;
        for(int i=0;i<k;++i){
            lscore -= cardPoints[k-1-i];
            rscore += cardPoints[n-1-i];
            max = Math.max(max,lscore+rscore);
        }
        return max;
            
    }
    /* 
    
    score = 6, score = 6+(1-3),6 = 6
    score = 6, score = 6+(6-2),6 = 10
    score = 10, score = 10+(5-1)
    
    
    */
}