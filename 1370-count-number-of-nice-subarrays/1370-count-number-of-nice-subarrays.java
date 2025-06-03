class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = fun(nums, k) - fun(nums, k-1);
        return ans;
    }
    public int fun(int[] nums, int k){
        int i=0;
        int j=0;
        int subArray = 0;
        while(i < nums.length){
            if(nums[i] % 2 != 0){
                k--;
            }
            while(k < 0){
                if(nums[j] % 2 != 0){
                    k++;
                }
                j++;
            }
            subArray += i-j+1;
            i++;
        }
        return subArray;
    }
}