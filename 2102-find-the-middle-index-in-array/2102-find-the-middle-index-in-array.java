class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for(int i: nums){
            totalSum += i;
        }
        int currSum = 0;
      
        if(totalSum == nums[0]) return 0;
        for(int i=1; i<nums.length; i++){
            currSum += nums[i-1];
            int ans = totalSum;
            if(ans - nums[i] - currSum*2 == 0){
                return i;
            }

        }
        return -1;
    }
}