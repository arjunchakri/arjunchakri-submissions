class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, left = 0;
        Set<Character> occurence = new HashSet<>(); 
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            while(occurence.contains(current)) {
                if(occurence.contains(s.charAt(left))) {
                    occurence.remove(s.charAt(left));
                }
                left++;
            }
            occurence.add(current);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}