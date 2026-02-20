class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}