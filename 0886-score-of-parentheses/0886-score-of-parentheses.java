class Solution {
    public int scoreOfParentheses(String s) {
        int count = 0;
        Stack <Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c =='('){
                st.push(c);
            }else{
                // if top is '('
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                    st.push('1');
                } else{
                    // if top is a number
                    int sum =0;
                    while(!st.isEmpty() && st.peek() != '('){
                        sum += st.pop() - '0';
                    }
                    // pop '('
                    st.pop();
                    st.push((char)(2*sum + '0'));
                }
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop() - '0';
        }
        return sum;
    }
}