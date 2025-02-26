class Solution {
    public int trap(int[] height) {
        int water =0;
        int start=0;
        int end = height.length-1;
        int leftMax=0;
        int rightMax=0;
        while(start < end){
            if(height[start] < height[end]){
                leftMax = Math.max(leftMax, height[start]);
                if(leftMax > height[start]){
                    water += leftMax-height[start];
                }
                start++;
            }else{
                rightMax = Math.max(rightMax, height[end]);
                if(rightMax > height[end]){
                    water += rightMax - height[end];
                }
                end--;
            }
        }
        return water;
    }
}