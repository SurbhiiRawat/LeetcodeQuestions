class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans = 0;
        int totalW = 0;
        int low = Integer.MAX_VALUE;
        for(int i=0; i<weights.length; i++){
            totalW += weights[i];
            low = Math.min(low, weights[i]);
        }
        int high = totalW;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isValid(weights, mid, days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean isValid(int arr[], int mid, int days){
        int weight = 0;
        int day = 1;
        for(int i=0; i<arr.length; i++){

            if(arr[i] > mid) return false;
            
            weight += arr[i];
            if(weight > mid){
                day++;
                weight = arr[i];
            }
        }
        return day <= days;
    }
}