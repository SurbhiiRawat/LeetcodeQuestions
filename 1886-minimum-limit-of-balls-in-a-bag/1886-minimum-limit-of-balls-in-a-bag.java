class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int ans =0;
        int min =1;
        int max = 0;
        for(int i:nums){
            max = Math.max(max,i);
        }
        while(min <= max){
            int mid = min + (max-min)/2;
            if(isValid(nums, mid, maxOperations)){
                max= mid-1;
                ans=mid;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int arr[], int mid, int maxOP){
        int totalOP=0;
        for(int i=0; i<arr.length; i++){
            int op =0;
            if(arr[i] > mid){
                if(arr[i]%mid ==0){
                    op = arr[i]/mid;
                    op--;
                }else{
                    op=arr[i]/mid;
                }
            }
            totalOP += op;
            if(totalOP > maxOP){
                return false;
            }
        }
        return true;
        
    }
}