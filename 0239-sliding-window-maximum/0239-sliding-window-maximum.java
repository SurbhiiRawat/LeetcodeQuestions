class Solution {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //i plementing a decreasing q, 
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.add(i);

            if (deque.peekFirst() < i - k + 1) {
                deque.removeFirst();
            }
            if (i >= k - 1) {
                ans.add(nums[deque.peekFirst()]);
            }
        }
        int[] array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            array[i] = ans.get(i); 
        }
        return array;
    }

}