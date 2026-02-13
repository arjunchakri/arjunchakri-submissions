class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        int product = 1;
        for(int i = 1; i < nums.length; i++) {
            product *= nums[i - 1];
            prefixProduct[i] = product;
        }

        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length - 1] = 1;
        product = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            product *= nums[i + 1];
            suffixProduct[i] = product;
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = suffixProduct[i] * prefixProduct[i];
        }
        return nums;
    }
}