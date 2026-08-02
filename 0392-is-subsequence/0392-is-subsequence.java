class Solution {
    public boolean isSubsequence(String s, String t) {
        int sI = 0;
        for(int i = 0; i < t.length() && sI < s.length(); i++) {
            if(s.charAt(sI) == t.charAt(i)) {
                sI++;
            }
        }
        return sI == s.length();
    }
}