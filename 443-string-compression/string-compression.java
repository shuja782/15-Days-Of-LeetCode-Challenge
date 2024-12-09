class Solution {
    public int compress(char[] chars) {
        StringBuilder s1 = new StringBuilder();
        int i = 0; 
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            s1.append(current);
            if (count > 1) {
                s1.append(count);
            }
        }
        for (int k = 0; k < s1.length(); k++) {
            chars[k] = s1.charAt(k);
        }
        return s1.length();
    }
}
