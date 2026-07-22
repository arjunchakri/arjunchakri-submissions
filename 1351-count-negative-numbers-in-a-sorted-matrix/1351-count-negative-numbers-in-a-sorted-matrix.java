class Solution {
    public int countNegatives(int[][] grid) {
        int negatives = 0;
        for(int[] eachArr: grid) {
            int i;
            for(i = eachArr.length - 1; i >= 0; i--) {
                if(eachArr[i] >= 0) {
                    break;
                }
            }
            negatives += eachArr.length - i - 1;
        }
        return negatives;
    }
}