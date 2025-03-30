class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(int n : map.keySet()){
            if(map.get(n) > nums.length/2){
               return n;
            }
        }
        return -1;
    }
}