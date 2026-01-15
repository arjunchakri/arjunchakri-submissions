class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecOnes = 0, currentCounter = 0;
        for(int each: nums) {
            if(each != 1) {
                currentCounter = 0;
            } else {
                currentCounter++;
            }
            maxConsecOnes = Math.max(maxConsecOnes, currentCounter);
        }
        return maxConsecOnes;
    }
}