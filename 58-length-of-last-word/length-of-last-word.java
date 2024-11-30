class Solution {
    public int lengthOfLastWord(String s) {
        int count= 0;
        boolean start = false;
        for (int i = s.length()-1; i >= 0;i--){
            if (s.charAt(i) != ' ')
                start = true;
            if (start == true && s.charAt(i) == ' ')
                return count;
            else if (start == true && s.charAt(i) != ' ') 
                count++;
        }
        return count;
    }
}