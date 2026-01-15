class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int counter = 0, lastElement = 0;
        for(int i = 0; i < target.length; i++) {
            int currentElement = target[i];
            int diff = currentElement - lastElement;
            if(diff == 1) {
                operations.add("Push");
            } else { // gap scenario
                for(int j = 0; j < diff - 1; j++) {
                    operations.add("Push");
                }
                for(int j = 0; j < diff - 1; j++) {
                    operations.add("Pop");
                }
                operations.add("Push");
            }
            lastElement = target[i];
        }
        return operations;
    }
}