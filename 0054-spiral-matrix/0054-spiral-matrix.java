class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int r1 = 0;
        int r2 = matrix.length;
        int c1 = 0;
        int c2 = matrix[0].length;
        while (r1 <= r2-1 && c1 <= c2-1) {
            for (int i = c1; i < c2; i++) {
                list.add(matrix[r1][i]);
            }
            for (int i = r1+1; i < r2; i++) {
                list.add(matrix[i][c2-1]);
            }
            if (r1 < r2-1 && c1 < c2-1) {
                for (int i = c2-2; i >= c1; i--) {
                    list.add(matrix[r2-1][i]);
                }
                for (int i = r2-2; i > r1; i--) {
                    list.add(matrix[i][c1]);
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;

        }
        return list;
    }

}