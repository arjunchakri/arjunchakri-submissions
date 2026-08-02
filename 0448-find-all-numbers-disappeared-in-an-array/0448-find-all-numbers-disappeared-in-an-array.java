class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int each: nums) {
            set.add(each);
        }
        for(int i = 0; i < n; i++) {
            if(!set.contains(i + 1)) {
                result.add(i + 1);
            }
        }

        return result;
    }
}