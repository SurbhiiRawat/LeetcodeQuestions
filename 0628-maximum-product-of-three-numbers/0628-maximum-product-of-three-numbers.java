class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int p1 = nums[n-1]*nums[n-2]*nums[n-3];
        int p2 = nums[n-1]*nums[0]*nums[1];
        if(p1 > p2){
            return p1;
        }
        return p2;
    }
}