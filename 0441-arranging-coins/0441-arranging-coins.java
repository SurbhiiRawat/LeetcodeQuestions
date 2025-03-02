class Solution {
    public int arrangeCoins(int n) {
        int min = 1;
        int max = n;
        int ans = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (isValid(mid, n)) {
                ans = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return ans;
    }

    public boolean isValid(int mid, int n) {
        long sum = (long) mid * (mid + 1) / 2;  // Use long to prevent integer overflow
        return sum <= n;
    }
}