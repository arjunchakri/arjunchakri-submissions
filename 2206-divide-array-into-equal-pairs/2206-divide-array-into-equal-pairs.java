class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int each: nums) {
            freq.put(each, 1 + freq.getOrDefault(each, 0));
        }
        for(int each: freq.values()) {
            if(each % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}