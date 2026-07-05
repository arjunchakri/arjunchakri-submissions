class Solution {
    public String restoreString(String s, int[] indices) {
        char[] resultChars = new char[s.length()];
        for(int i = 0; i < indices.length; i++) {
            resultChars[indices[i]] = s.charAt(i);
        }

        StringBuilder result = new StringBuilder();
        for(char each: resultChars) {
            result.append(each);
        }
        return result.toString();
    }
}