class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            int left = i;
            int right = n-i-1;
            if(left==right) sum+= mat[i][left];
            else sum += mat[i][left] + mat[i][right];
        }
        return sum;
    }
}