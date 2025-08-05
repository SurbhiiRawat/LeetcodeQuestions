class Solution {
    public int totalMoney(int n) {
        int start= 0;
        int rem = n%7;
        int weeks = n/7;
        int money = 0;
        while(start <weeks){
            int end = start + 7;

            money += ((end * (end+1))/2) - ((start * (start+1))/2);
            start++;
        }
        return money + (((rem + start) * ((rem + start)+1))/2) - ((start * (start+1))/2);
        
    }
}