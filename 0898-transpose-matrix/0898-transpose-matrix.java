class Solution {
    public int[][] transpose(int[][] matrix) {
        int ans[][] = new int[matrix[0].length][matrix.length];
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
    }
}