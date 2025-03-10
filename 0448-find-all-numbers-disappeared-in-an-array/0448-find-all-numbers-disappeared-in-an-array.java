class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i=1; i<=n; i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}