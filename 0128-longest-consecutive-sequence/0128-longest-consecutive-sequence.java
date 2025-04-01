class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int len = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i : set){
            if(!set.contains(i-1)){
                int count =1;
                int x = i;
                while(set.contains(i+1)){
                    count++;
                    i++;
                }
                len = Math.max(len, count);
            }
        }
        return len;
    }
}