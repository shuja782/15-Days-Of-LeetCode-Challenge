class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length;i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int current = nums[i] + nums[j] + nums[k];
                if (current == 0){
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(j < k && nums[j] == nums[j-1])
                        j++;
                    k--;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
                else if (current < 0)
                    j++;
                else 
                    k--;
            }
        }
        return triplets;
    }
}