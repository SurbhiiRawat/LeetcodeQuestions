class NumArray {
    int nums[];

    public NumArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i]=nums[i-1] + nums[i]; 
        }
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return nums[right];
        int ans = nums[right] - nums[left-1];
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */