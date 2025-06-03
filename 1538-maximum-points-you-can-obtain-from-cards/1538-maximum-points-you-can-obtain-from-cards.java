class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score = 0;
        int ans = 0;
        for(int i=0; i<k; i++){
            score += cardPoints[i];
        }
        ans = score;
        int j = cardPoints.length-1;
        while(k!=0){
            score -= cardPoints[k-1];
            score += cardPoints[j];
            ans = Math.max(ans, score);
            k--;
            j--;
        }
        return ans;
    }
}