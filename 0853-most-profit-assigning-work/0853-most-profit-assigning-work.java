class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = profit.length;
        int maxDifficulty = 0;
        for (int d : difficulty) {
            maxDifficulty = Math.max(maxDifficulty, d);
        }
        int[] arr = new int[ maxDifficulty + 1];
        for(int i = 0; i < n; i++){
            arr[difficulty[i]] = Math.max(arr[difficulty[i]], profit[i]);;
        }
        for(int i = 1; i <= maxDifficulty; i++){
            arr[i] = Math.max(arr[i - 1], arr[i]);
        }
        int ans = 0;
        for(int i = 0; i < worker.length; i++){
            int effectiveSkill = Math.min(worker[i], maxDifficulty);
            ans += arr[effectiveSkill];
        }
        return ans;
    }
}
//prerfix maximum 
//difficulty index = 0;
//