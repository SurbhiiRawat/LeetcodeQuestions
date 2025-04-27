class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0; i<prefix.length; i++){
            min = Math.min(min, prefix[i]);
        }
        if(min > 0) return 1;
        else return -min+1;
    }
}