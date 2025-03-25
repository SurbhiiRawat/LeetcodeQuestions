class Solution {
    public int findShortestSubArray(int[] nums) {
        int len= nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int degree = 0;
        for(int i=1; i<nums.length; i++){
            degree = Math.max(degree, map.get(nums[i]));
        }
        System.out.println(degree);
        Map<Integer, Integer> ind1 = new HashMap<>();
        Map<Integer, Integer> ind2 = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!ind1.containsKey(nums[i])){
                ind1.put(nums[i], i);
            }
            ind2.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])==degree){
                len = Math.min(len, ind2.get(nums[i]) - ind1.get(nums[i]) +1);
            }
        }
        return len;
    }
}