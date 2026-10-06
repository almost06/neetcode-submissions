class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length-1; 
        while(numbers[pointer1] + numbers[pointer2] != target && pointer1 != pointer2){
            int total = numbers[pointer1] + numbers[pointer2];
            if(total>target) pointer2 --; 
            else if(total<target) pointer1 ++;
        }
        return new int[]{pointer1+1, pointer2+1};
    }
}
