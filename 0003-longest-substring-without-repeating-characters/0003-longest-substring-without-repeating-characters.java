class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Map<Character, Integer> mem = new HashMap<>();
        for( right = 0; right < s.length(); right++) {
            if(mem.containsKey(s.charAt(right))) {
                left = Math.max(left,mem.get(s.charAt(right)) + 1);
            }
            maxLen = Math.max(maxLen, right - left + 1);
            mem.put(s.charAt(right), right);
        }
        return maxLen;
    }
}