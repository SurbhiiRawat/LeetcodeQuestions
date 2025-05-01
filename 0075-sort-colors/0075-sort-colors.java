class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int two= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zeroes++;
            if(nums[i]==1) ones++;
            if(nums[i]==2) two++;
        }
        int j=0;
        for(int i=0; i<zeroes; i++){
            nums[i]=0;
            j++;
        }
        for(int i=0; i<ones; i++){
            nums[j]=1;
            j++;
        }
        for(int i=0; i<two; i++){
            nums[j]=2;
            j++;
        }
    }
}