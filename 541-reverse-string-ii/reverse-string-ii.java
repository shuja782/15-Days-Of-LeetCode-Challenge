class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder s1 = new StringBuilder(s);
        int j;
        int m;
        for (int i = 0; i < s.length(); i+=2*k){
            j = i;
            m = j + k-1;
            if (m >= s.length()){
                while(m >= s.length()){
                    m--;
                }
            }
            while (j < m){
                char temp = s1.charAt(j);
                s1.setCharAt(j,s1.charAt(m));
                s1.setCharAt(m,temp);
                j++;
                m--;
            }
        }
        return s1.toString();
    }
}