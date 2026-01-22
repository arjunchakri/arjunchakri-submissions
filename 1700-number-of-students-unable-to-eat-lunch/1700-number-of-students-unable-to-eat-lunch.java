class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for(int each: students) {
            queue.offer(each);
        }
        for(int i = 0; i < sandwiches.length && !queue.isEmpty(); i++) {
            int sandwich = sandwiches[i];
            int currentStudent = queue.peek();
            int size = queue.size();
            while(currentStudent != sandwich) {
                queue.offer(currentStudent); // add him to queue
                queue.poll(); // remove him from top
                currentStudent = queue.peek();
                size--;
                if(size < 0) {
                    return queue.size();
                }
            }
            queue.poll(); // FOUND HIS MATCH - remove him from top and go to the next sandwitch
        }
        return queue.size();
    }
}