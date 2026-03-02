class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || s.isEmpty()) {
            return true;
        }
        int sIndex = 0, tIndex = 0;
        for(tIndex = 0; tIndex < t.length() && sIndex < s.length(); tIndex++) {
            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if(sIndex == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}