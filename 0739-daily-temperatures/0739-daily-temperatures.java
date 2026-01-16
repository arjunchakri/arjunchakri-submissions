class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0; i--) {
            // clean up of smaller temps 
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            int nextTempDiff = 
                (stack.isEmpty()) ? 0 : stack.peek() - i;
            stack.push(i);
            result[i] = nextTempDiff;
        } 
        return result;
    }
}