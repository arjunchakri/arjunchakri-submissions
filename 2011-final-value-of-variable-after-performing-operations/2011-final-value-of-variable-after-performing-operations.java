class Solution {
    public int finalValueAfterOperations(String[] operations) {
        Set<String> plusOperation = new HashSet<>(Arrays.asList("X++", "++X"));
        Set<String> minusOperation = new HashSet<>(Arrays.asList("X--", "--X"));

        int value = 0;
        for(String each: operations) {
            if(plusOperation.contains(each)) {
                value++;
            } else if(minusOperation.contains(each)) {
                value--;
            }
        }
        return value;
    }
}