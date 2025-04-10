class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int sum=0; 
        int n = nums.length;
        int right=0;
        int left=0;
        for(int i = 0; i < n-2; i++){
            left = i + 1;
            right = n - 1; 
            while(left < right){
                if( Math.abs(nums[i] + nums[left] + nums[right] - target) < diff ){
                    sum = nums[i] + nums[left] + nums[right];
                    diff = Math.abs(nums[i] + nums[left] + nums[right] - target);
                }
                else if(nums[i] + nums[left] + nums[right] < target) left++;
                else right--;
            }
        }
        return sum;
        


    }
}