class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length - 1];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < first.length() && first.charAt(i) == last.charAt(i); i++) {
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}