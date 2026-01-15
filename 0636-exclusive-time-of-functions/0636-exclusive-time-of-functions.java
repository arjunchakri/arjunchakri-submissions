class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int prevTime = 0;
        int[] timeSpent = new int[n];
        Stack<Integer> stack = new Stack();
        for(String each: logs) {
            String[] pieces = each.split(":");
            int id = Integer.parseInt(pieces[0]); 
            String function = pieces[1]; 
            int time = Integer.parseInt(pieces[2]); 
            if("start".equalsIgnoreCase(function)) {
                if(!stack.isEmpty()) {
                    timeSpent[stack.peek()] += time - prevTime;
                }
                stack.push(id);
                prevTime = time;
            } else {
                timeSpent[stack.pop()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }
        return timeSpent;
    }
}