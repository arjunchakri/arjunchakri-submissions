class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        trackCombinations(result, candidates, target, new ArrayList<>(), 0, 0);
        return result;
    }

    private void trackCombinations(List<List<Integer>> result, int[] candidates, 
        int target, List<Integer> elements, int currentSum, int start) {
        if(target == currentSum) {
            result.add(new ArrayList<>(elements));
            return;
        }
        if(target > currentSum) { // only proceed, if there is a scope of addition
            for(int i = start; i < candidates.length; i++) {
                elements.add(candidates[i]);
                trackCombinations(result, candidates, target, elements, currentSum + candidates[i], i);
                elements.remove(elements.size() - 1);
            }
        }
    }
}