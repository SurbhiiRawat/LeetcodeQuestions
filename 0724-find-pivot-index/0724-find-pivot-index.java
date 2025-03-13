class Solution {
    public int pivotIndex(int[] nums) {
        int ans =-1;
        for(int i=0; i<nums.length; i++){
            if(leftsum(nums,i)==rightsum(nums,i)){
                ans =i;
                break;
            } 
        }
        return ans;
        

    }
    public int leftsum(int arr[], int k){
            int sum=0;
            for(int i=0; i<k; i++){
                sum+= arr[i];
            }
            return sum;
        }
        public int rightsum(int arr[], int k){
            int sum=0;
            for(int i=k+1; i<arr.length; i++){
                sum+= arr[i];
            }
            return sum;
        }
}