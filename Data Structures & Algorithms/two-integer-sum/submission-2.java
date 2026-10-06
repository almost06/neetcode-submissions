class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = target;
        for(int i = 0; i < nums.length ; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length ; i++){
            temp -= nums[i];
            if(map.get(temp) != null && map.get(temp) != i){
                return new int[]{i, map.get(temp)};
            }
            temp = target;
        }
        return null;
    }
}
