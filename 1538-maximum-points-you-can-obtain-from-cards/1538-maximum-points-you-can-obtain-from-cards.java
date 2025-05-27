class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int start =0;
        int end = k-1;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;
        int right = n-1;
        for(int i=k-1; i>=0; i--){
            sum -= cardPoints[i];
            sum += cardPoints[right];
            right--;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}