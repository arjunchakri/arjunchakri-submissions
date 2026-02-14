class Solution {
    public int reverse(int x) {
        if(x == 0) {
            return 0;
        }
        int isNegative = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        String numStr = new String(x + "");
        StringBuilder builder = new StringBuilder();
        for(int i = numStr.length() - 1; i >= 0; i--) {
            builder.append(numStr.charAt(i));
        }
        int result = 0;
        try {
            result = isNegative * Integer.parseInt(builder.toString());
        } catch(Exception e) {
        }
        return result;
    }
}