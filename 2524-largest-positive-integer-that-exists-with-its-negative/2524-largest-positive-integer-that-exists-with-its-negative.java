class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        Arrays.sort(nums);
        for(int i=nums.length-1; i>= 0; i--){
            if(nums[i]>=0 && set.contains(-nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}