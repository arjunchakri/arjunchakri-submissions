class Solution {
    public int[] findErrorNums(int[] nums) {
        int missingNumber = -1;
        int duplicateNumber = -1;
        
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) {
                duplicateNumber = index + 1;
            } else {
                nums[index] = -1 * nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                missingNumber = i + 1;
            }
        }
        return new int[] {duplicateNumber, missingNumber};
    }
}