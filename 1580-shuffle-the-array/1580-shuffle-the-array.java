class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int i=0;
        int j=n;
        for(int k=0; k<nums.length-1; k+=2){
            arr[k]=nums[i];
            i++;
            arr[k+1]=nums[j];
            j++;
        }
        return arr;
    }
}