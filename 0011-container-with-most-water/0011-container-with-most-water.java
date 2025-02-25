class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int water =0;
        int start =0;
        int end = height.length-1;
        while(start < end){
            water = (Math.min(height[start], height[end])) * (end-start);
            if(height[end] < height[start]){
                end--;
            }else{
                start++;
            }
            ans = Math.max(ans, water);
        }
        return ans;
        
    }
}