class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        
        Map<Integer, Integer> sortedOccurence = new HashMap<>();
        for(int i = 0; i < sorted.length; i++) {
            if(!sortedOccurence.containsKey(sorted[i])) {
                sortedOccurence.put(sorted[i], i);
            }
        }

        int[] result = new int[sorted.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = sortedOccurence.get(nums[i]);
        }
        return result; 
    }
}