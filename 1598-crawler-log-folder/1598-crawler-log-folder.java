class Solution {
    public int minOperations(String[] logs) {
        int i = 0;
        for(String each: logs) {
            if("../".equals(each)) {
                if(i >= 1) {
                    i--;
                }
            }  else if ("./".equals(each)) {
                // do nothing
            } 
            else {
                i++;
            }
        }
        return i;
    }
}