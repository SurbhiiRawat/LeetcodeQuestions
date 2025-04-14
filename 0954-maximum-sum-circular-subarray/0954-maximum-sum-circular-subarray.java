class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        int i=0;
        int j=0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        while(j<arr.length){
            
                sum += arr[j];
                minSum = Math.min(sum, minSum);
                if(sum > 0){
                   sum=0;
                 
                }
                
                j++;
            
        }
        int p=0;
        int q=0;
        int sum2 = 0;
        int maxSum = Integer.MIN_VALUE;
        while(q<arr.length){
            sum2 += arr[q];
            maxSum = Math.max(sum2, maxSum);
            if(sum2 < 0){
                sum2=0;
               
            }
            
            q++;
            
        }
        if(maxSum < 0) return maxSum;
        return Math.max(totalSum - minSum, maxSum);
    }
}