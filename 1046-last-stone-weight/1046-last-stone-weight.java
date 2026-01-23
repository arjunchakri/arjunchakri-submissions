class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int each: stones) {
            pq.offer(each);
        }
        while(pq.size() > 1) {
            int diff = pq.poll() - pq.poll();
            if(diff > 0) {
                pq.offer(diff);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}