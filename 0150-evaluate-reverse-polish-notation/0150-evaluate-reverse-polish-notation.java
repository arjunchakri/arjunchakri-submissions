class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> OPERANDS = Set.of("+", "-", "/", "*");

        Stack<Integer> stack = new Stack<>();
        for(String each: tokens) {
            if(!OPERANDS.contains(each)) {
                stack.push(Integer.parseInt(each));
            } else {
                char eachChar = each.charAt(0);
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                if(eachChar == '+') {
                    stack.push(firstNum + secondNum);
                } else if(eachChar == '-') {
                    stack.push(firstNum - secondNum);
                } else if(eachChar == '*') {
                    stack.push(firstNum * secondNum);
                } else if(eachChar == '/') {
                    stack.push(firstNum / secondNum);
                } 
            }
        }
        return stack.pop();
    }
}