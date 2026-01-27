class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char first = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == first && s.length() % i == 0) {
                if(isRepeatingSubstring(i, s)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isRepeatingSubstring(int end, String s) {
        int times = s.length() / end, counter = 0;
        for(int i = 0; i < times; i++) {
            for(int j = 0; j < end; j++) {
                if(s.charAt(counter++) != s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}