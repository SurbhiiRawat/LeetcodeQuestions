class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int totalHours = totalHr(piles, mid);
            if(totalHours <= h){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int totalHr(int[] arr, int k){
        int totalhr = 0;
        for(int i =0; i< arr.length; i++){
            totalhr += Math.ceil((double)arr[i]/(double)k);
        }
        return totalhr;
    }
    public static int findMax(int[] arr){
        int max = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}