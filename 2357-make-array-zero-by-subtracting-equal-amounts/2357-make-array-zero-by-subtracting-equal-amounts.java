class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int each: nums) {
            if(each != 0) {
                unique.add(each);
            }
        }
        return unique.size();
    }
}