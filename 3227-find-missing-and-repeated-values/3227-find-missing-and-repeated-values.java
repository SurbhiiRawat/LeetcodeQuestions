class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i) != 1){
                ans[0] = i;
            }
        }
        int start = 0;
        int end = grid.length*grid.length;
        for(int i=0; i<=end; i++){
            if(!map.containsKey(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}