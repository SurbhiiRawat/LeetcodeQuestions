class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(r*c != n*m) return mat;
        int ans[][] = new int[r][c];
        int p1=0;
        int p2=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(p2==mat[0].length){
                    p2=0;
                    p1++;
                }
                if(p1==mat.length) break;
                ans[i][j] = mat[p1][p2];
                p2++;
                
            }
        }
        return ans;
    }
}