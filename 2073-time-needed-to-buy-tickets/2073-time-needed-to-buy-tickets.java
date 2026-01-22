class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }
        int timeTaken = 0;
        while(!queue.isEmpty()) {
            int current = queue.poll();
            timeTaken++;
            tickets[current]--;
            if(tickets[current] == 0 && current == k) {
                return timeTaken;
            }
            if(tickets[current] > 0) {
                queue.offer(current);
            }
        }
        return timeTaken;

    }
}