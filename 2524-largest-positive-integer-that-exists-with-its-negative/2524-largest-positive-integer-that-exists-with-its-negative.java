class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Arrays.sort(nums);
        for(int i=nums.length-1; i>= 0; i--){
            if(map.containsKey(nums[i]) && map.containsKey(-nums[i])){
                ans= Math.abs(nums[i]);
            }
        }
        return ans;
    }
}