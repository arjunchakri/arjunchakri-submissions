class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int counter = 0;
        for(int i = 0; i < n; i++) {
            result[counter++] = nums[i];
            result[counter++] = nums[i + n];
        }
        return result;
    }
}