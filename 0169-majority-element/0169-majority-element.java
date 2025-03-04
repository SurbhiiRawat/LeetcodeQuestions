class Solution {
    public int majorityElement(int[] nums) {
        // HashMap <Integer, Integer> mpp = new HashMap<>();
        // int ans = -1;
        // for(int i=0; i<nums.length; i++){
        //     mpp.put(nums[1], mpp.getOrDefault(nums[i], 0)+1);
        // }
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];
    }
}