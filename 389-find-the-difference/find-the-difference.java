class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i = 0; i < t1.length; i++){
            if (i < s1.length && t1[i] != s1[i])
                return t1[i];
            if (i >= s1.length)
                return t1[i];
        }
        return '\0';
    }
}