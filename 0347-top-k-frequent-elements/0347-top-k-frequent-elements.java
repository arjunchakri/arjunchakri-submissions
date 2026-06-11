class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> inputFreq = new HashMap<>();
        for(int each: nums) {
            inputFreq.put(each, 
                inputFreq.getOrDefault(each, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq 
            = new PriorityQueue<>((a,b) -> -1 * Integer.compare(a.getValue(), b.getValue()));
        for(Map.Entry<Integer, Integer> each: inputFreq.entrySet()) {
            pq.offer(each);
        }
        int[] result = new int[k];
        for(int i = 0; i < k && !pq.isEmpty(); i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}