class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int res[] = new int[nums.length];
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }
        int leftSize = 0;
        int leftSum = 0;
        int rightSize = 0;
        int rightSum = 0;
        for(int i=0; i<nums.length; i++){
            leftSize = i;
            rightSize = nums.length-1-i;
            rightSum = totalSum - nums[i] - leftSum;
            res[i] = (leftSize * nums[i] - leftSum) + (rightSum - rightSize * nums[i]);
            leftSum += nums[i];
        } 
        return res;
    }
}