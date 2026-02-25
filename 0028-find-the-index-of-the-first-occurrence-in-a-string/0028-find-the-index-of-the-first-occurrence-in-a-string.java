class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int needleIndex = 0;
            for(needleIndex = 0; needleIndex < needle.length(); needleIndex++) {
                if(haystack.charAt(i + needleIndex) != needle.charAt(needleIndex)) {
                    break;
                }
            }
            if(needleIndex == needle.length()) {
                return i;
            } 
        }
        return -1;
    }
}