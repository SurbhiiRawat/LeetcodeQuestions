class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap <Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if( !mpp.containsKey(x)){
                mpp.put(nums[i], i);
            }else{
                ans[0]=i;
                ans[1]=mpp.get(x); 
            }
        }
        return ans;
    }
}