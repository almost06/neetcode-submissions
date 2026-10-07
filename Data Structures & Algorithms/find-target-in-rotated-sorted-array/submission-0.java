class Solution {
    public int search(int[] nums, int target) {
        int big = 0;
        int small = nums.length-1;
        while(big<small){
            int half = big + (small - big )/2;
            if(nums[half] > nums[small]) big = half + 1;
            else small = half; 
        }

        int rotationAmount = small;
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            int half = (mid + rotationAmount)%nums.length ;

            if(nums[half] == target) return half;
            else if(nums[half] > target) end = mid - 1;
            else start = mid + 1;
        }

        return -1; 
    }
}
