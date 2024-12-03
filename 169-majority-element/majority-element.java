class Solution {
    public int majorityElement(int[] nums) {
        int count;
        for (int i = 0; i< nums.length-1; i++){
            count = 1;
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > nums.length/2)
                    return nums[i];

        }
        return nums[0];
    }
}