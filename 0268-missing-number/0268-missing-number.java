class Solution {
    public int missingNumber(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        for(int i=0; i<=set.size(); i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}