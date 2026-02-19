class Solution {
    public int lengthOfLastWord(String s) {
        String[] pieces = s.split("\\s+");
        return pieces[pieces.length - 1].length();
    }
}