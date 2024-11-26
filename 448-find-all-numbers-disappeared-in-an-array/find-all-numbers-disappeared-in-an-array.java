class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] available = new boolean[nums.length];
        for (int i = 0; i < nums.length;i++){
            available[nums[i]-1] = true; 
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < available.length; i++){
            if (available[i] == false){
                list.add(i+1);
            }
        }
        return list;
    }
}