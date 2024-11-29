class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for (int i = m; i < nums1.length; i++){
        //     num1[i] = 
        // }
        int i = 0;
        while (i != n){
            nums1[m] = nums2[i];
            m++;
            i++;
        }
        Arrays.sort(nums1);
    }
}