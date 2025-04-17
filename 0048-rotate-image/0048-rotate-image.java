class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int row=0; row<matrix.length; row++){
            for(int col1=0, col2 = matrix[0].length-1; col1<col2; col1++, col2--){
                int temp = matrix[row][col1];
                matrix[row][col1] = matrix[row][col2];
                matrix[row][col2] = temp;
            }
        }
    }
}