class Solution {
    // first
        //find previous smaller element 
        // and next smaller el 

    public int[] small(int[] heights){
        int left[] = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            
            if(st.isEmpty()) left[i] = -1;
            else left[i] = st.peek();
            st.push(i);
        }
        return left;
    }    
    public int[] nextSmaller(int[] heights) {
        int[] right = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = heights.length;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }
        return right;
    }

    public int largestRectangleArea(int[] heights) {
        int area=0;
        
            int[] leftIndex = small(heights);       //prev small el

            int[] rightIndex = nextSmaller(heights);
            for(int i=0; i<heights.length; i++){
                area = Math.max(area, (rightIndex[i]-leftIndex[i]-1) * heights[i]);
            }    
        
        return area;
    }
}