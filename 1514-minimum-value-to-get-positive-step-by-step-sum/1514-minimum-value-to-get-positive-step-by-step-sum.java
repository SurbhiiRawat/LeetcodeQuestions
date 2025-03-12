class Solution {
    public int minStartValue(int[] nums) {
        
        int max = Math.min(nums[0],Integer.MAX_VALUE);
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
            max = Math.min(max, nums[i]);
        }
        if(max >0) return 1;
        return Math.abs(max)+1;
    }
}