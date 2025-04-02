class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                ans[st.peek()] = i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = 0;
        }
        return ans;
    }
}