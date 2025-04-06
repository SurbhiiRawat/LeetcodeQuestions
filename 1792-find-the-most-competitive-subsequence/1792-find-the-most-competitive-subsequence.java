class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] ans = new int[k];
        Stack<Integer> st = new Stack<>();
        k=nums.length-k;
        for(int i=0; i<nums.length; i++){
            while(!st.isEmpty() && st.peek() > nums[i] && k>0){
                st.pop();
                k--;
            }
            st.push(nums[i]);
        }
        while(k!=0){
            st.pop();
            k--;
        }    
        
        for (int i = ans.length- 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}