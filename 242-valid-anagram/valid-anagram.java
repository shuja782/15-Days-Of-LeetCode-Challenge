class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        short[] chars = new short[26]; 
        for (int i = 0; i < s.length();i++){
            chars[s.charAt(i) - 'a'] += 1;
            chars[t.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0 ; i < chars.length; i++){
            if (chars[i] != 0)
                return false;
        }
        return true;
    }
}