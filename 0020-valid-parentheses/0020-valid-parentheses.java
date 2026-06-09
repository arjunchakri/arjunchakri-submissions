class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> braces = new HashMap<>();
        braces.put(']', '[');
        braces.put('}', '{');
        braces.put(')', '(');

        Stack<Character> stack = new Stack();
        for(char each: s.toCharArray()) {
            if(braces.containsKey(each)) { // top should 
                if(stack.isEmpty() || stack.peek() != braces.get(each)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(each);
            }
            
        }

        return stack.isEmpty();
    }
}