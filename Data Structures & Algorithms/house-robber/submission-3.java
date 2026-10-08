class Solution {
    public int rob(int[] nums) {
        int[] m = new int[nums.length];
        m[nums.length-1] = nums[nums.length-1];
        int max1 = -1;
        int max2 = -1;
        if(nums.length == 1) return nums[0];
        m[nums.length-2] = nums[nums.length-2];
        if(nums[nums.length-1] >= nums[nums.length-2]){
            max1 = nums.length-1; 
            max2 = nums.length-2;
        }else{
            max1 = nums.length-2;
            max2 = nums.length-1;
        }
        if(nums.length == 2) return nums[max1];
        for(int i = nums.length-3; i >= 0; i--){
            int max = max1 == i+1 ? max2 : max1; 
            int sum = nums[i] + m[max];
            m[i] = sum; 
            if(sum> m[max1]){
                max2 = max1; 
                max1 = i; 
            } else if(sum < m[max1] && sum > m[max2]){
                max2 = i;
            }
        }
        return m[max1];
    }
}
