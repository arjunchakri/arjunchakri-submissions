class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[256];
        for(char each: s.toCharArray()) {
            freq[(int) each]++;
        }        
        for(char each: t.toCharArray()) {
            freq[(int) each]--;
            if(freq[(int) each] < 0) {
                return false;
            }
        }
        for(int each: freq) {
            if(each != 0) {
                return false;
            }
        }

        return true;
    }
}