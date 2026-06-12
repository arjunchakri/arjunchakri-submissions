class Solution {
    public int numIdenticalPairs(int[] nums) {
       Map<Integer, Integer> freq = new HashMap<>();
       int count = 0;
       for(int each: nums) {
            if(freq.containsKey(each)) {
                count += freq.get(each);
            }
            freq.put(each, freq.getOrDefault(each, 0) + 1);
       } 
       return count;
    }
}