class Solution {
    public int maximumCandies(int[] candies, long k) {
        int ans =0;
        int min = 1;
        int max = 0;
        for(int i=0; i<candies.length; i++){
            max = Math.max(candies[i], max);
        }
        while(min <= max){
            int mid = min+(max-min)/2;
            if(isValid(candies, mid, k)){
                ans = mid;
                min = mid+1;
                
            }else{
                max = mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int arr[], int mid, long k){
        long ans =0;
        for(int i=0; i<arr.length; i++){
            ans = arr[i]/mid;
            k -= ans;
        }
        if(k<=0){
            return true;
        }else{
            return false;
        }
    }
}