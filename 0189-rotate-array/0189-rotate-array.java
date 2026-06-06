class Solution {
    public void rotate(int[] nums, int k) {

        if(nums == null || nums.length <= 1) {
            return;
        }
        k = k % nums.length;
        if( k == 0) {
            return;
        }
        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    private void reverseArray(int[] input, int i, int j) {
        while(i < j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;

            i++;
            j--;
        }
    }
}