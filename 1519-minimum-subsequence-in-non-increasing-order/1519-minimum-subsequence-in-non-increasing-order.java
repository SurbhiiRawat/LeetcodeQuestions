class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int i=nums.length-1;
        int currSum =0;
        while(i>=0){
            currSum += nums[i];
            sum -= nums[i];
            ans.add(nums[i]);
            if(currSum > sum){
                break;
            }
            i--;
        }
        return ans;
    }
}