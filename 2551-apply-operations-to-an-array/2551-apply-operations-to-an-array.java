class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length-1;
        int index =0;
        for(int i=0; i<n; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        moveAllZeroes(nums);
        return nums;
    }
    public void moveAllZeroes(int nums[]){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        while(k<nums.length){
            nums[k++]=0;
        }
    }
}