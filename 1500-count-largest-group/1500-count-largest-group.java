class Solution {
    public int countLargestGroup(int n) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=1; i<= n; i++){
            int digitSum = digSum(i);
            map.put(digitSum, map.getOrDefault(digitSum, 0)+1);
        }
        int max=0;
        for(int i: map.keySet()){
            max = Math.max(max, map.get(i));
        }
        int ans =0;
        for(int i: map.keySet()){
            if(map.get(i) == max){
                ans++;
            }
        }
        return ans;
    }
    public int digSum(int num){
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}