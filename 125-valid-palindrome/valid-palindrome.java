class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                s1.append(c);
            }
        }
        s = s1.toString();
        s1.reverse();
        if (s.equals(s1.toString()))
            return true;
        return false;
    }
}