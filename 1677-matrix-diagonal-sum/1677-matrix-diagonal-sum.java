class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            if(i==n-1-i) ans+= mat[i][i];
            else ans += mat[i][i] + mat[i][n-1-i];
        }
        return ans;
    }
}