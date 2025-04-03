class MinStack {
    ArrayList<Integer> arr;

    public MinStack() {
        arr = new ArrayList<>();
    }

    public void push(int val) {
        arr.add(val);
    }

    public void pop() {
        arr.remove(arr.size() - 1);
    }

    public int top() {
        int top = arr.get(arr.size() - 1);
        return top;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */