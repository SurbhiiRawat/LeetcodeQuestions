class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int len = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum % k)){
                len = i -map.get(sum % k);
                if(len >= 2){
                    return true;
                }
            }
            else map.put(sum % k, i);
        }
        return false;
    }
}