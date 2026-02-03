class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder cleaned = new StringBuilder();

        // remove dashes + uppercase
        for (char c : s.toCharArray()) {
            if (c != '-') cleaned.append(Character.toUpperCase(c));
        }

        StringBuilder res = new StringBuilder();
        int count = 0;

        // build from right to left
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            if (count == k) {
                res.append('-');
                count = 0;
            }
            res.append(cleaned.charAt(i));
            count++;
        }

        return res.reverse().toString();
    }
}
