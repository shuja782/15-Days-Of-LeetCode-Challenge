class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] array = s.toCharArray();

        while ( i < j ){
            while (i < j && !Character.isLetterOrDigit(array[i]))
                i++;
            while (i < j && !Character.isLetterOrDigit(array[j]))
                j--;
            if (Character.toLowerCase(array[i]) != Character.toLowerCase(array[j]))
                return false;
            i++;
            j--;
        }
        return true;
    }
}