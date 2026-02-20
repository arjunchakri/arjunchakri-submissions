class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder builder = new StringBuilder();
        int n = Math.min(first.length(), last.length());
        for(int i = 0; i < n; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                builder.append(first.charAt(i));
            } else {
                break;
            }
        }
        return builder.toString();
    }
}