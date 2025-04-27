class Solution {
    public int largestAltitude(int[] gain) {
        int height[] = new int[gain.length +1];
        int max = 0;
        height[0] = 0;
        for(int i=1; i<height.length; i++){
            height[i] = height[i-1] + gain[i-1];
        }
        for(int i=0; i<height.length; i++){
            max = Math.max(max, height[i]);
        }
        return max;
    }
}