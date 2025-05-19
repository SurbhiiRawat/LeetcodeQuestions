class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long ans = 0;
        long min = Integer.MAX_VALUE;
        long max = 0;
        for(int i=0; i<batteries.length; i++){
            min = Math.min(min, batteries[i]);
            max += batteries[i];
        }
        while(min <= max){
            long mid = min + (max-min)/2;
            if(isValid(batteries, mid, n)){
                ans = mid;
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int arr[], long mid, int n){
        long sum =0;
        long val = mid*n;
        for(int i=0; i<arr.length; i++){
            sum += Math.min(arr[i], mid);
        }
        return (sum >= val);
    }
}