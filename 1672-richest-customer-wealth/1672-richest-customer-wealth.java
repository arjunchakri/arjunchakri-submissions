class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] eachArr: accounts) {
            int sum = 0;
            for(int each: eachArr) {
                sum += each;
            }

            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}