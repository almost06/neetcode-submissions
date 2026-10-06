class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = target;
        for(int i = 0; i < nums.length; i++){
            temp -= nums[i];
            for(int j = i +1; j < nums.length; j++){ 
                if(temp - nums[j] == 0) return new int[]{i, j};
            }
            temp = target;
        }
        return null;
    }
}
