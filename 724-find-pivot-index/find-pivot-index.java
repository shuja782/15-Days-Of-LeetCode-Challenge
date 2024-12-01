class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        for (int i = 0; i<nums.length; i++){
            rightSum = total - nums[i] - leftSum;
            if (leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;

    }
}