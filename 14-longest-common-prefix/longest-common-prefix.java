class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++){
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i))
                s1.append(strs[0].charAt(i));
            else 
                return s1.toString();
        }
        return s1.toString();
    }
}