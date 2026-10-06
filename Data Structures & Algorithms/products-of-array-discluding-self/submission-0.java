class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];
        int total = 1;
        for(int i = right.length -1 ; i>= 0; i--){
            total *= nums[i];
            right[i] = total;
        }
        total = 1; 
        for(int i = 0 ; i< nums.length; i++){
            total *= nums[i]; 
            left[i] = total;
        }

        int[] result = new int[nums.length];
        for( int i = 0; i< result.length; i++){
            if(i == 0) result[i] = right[i +1];
            else if(i == result.length -1) result[i] = left[i -1];
            else result[i] = left[i-1]*right[i+1];
        }
        return result; 
    }
}  
