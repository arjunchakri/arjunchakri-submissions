class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> minStack = new Stack<>();
        for(int i = prices.length - 1; i >= 0; i--) {
            int discount = 0;
            while(!minStack.isEmpty() && minStack.peek() > prices[i]) {
                minStack.pop();
            }
            if(!minStack.isEmpty()) {
                discount = minStack.peek();
            }
            minStack.push(prices[i]);
            prices[i] = prices[i] - discount;
        }
        return prices;
    }
}