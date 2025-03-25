class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1 );
        }
        for(int i= 0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])== 2 ){
                list.add(nums[i]);
                map.remove(nums[i]);
            }
        }
        return list;
    }
}