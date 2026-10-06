class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> alr = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            int target =  - nums[i];
            var list = twoSum(nums, i, target);
            if(list.isEmpty()) continue;
            for(var e: list){
                e.add(nums[i]);
                Collections.sort(e);
                if(!alr.add(e)) continue;
                res.add(e);
            }
        }
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, int exceptInd, int target){
        int pointer1 = 0;
        int pointer2 = nums.length -1; 
        ArrayList<List<Integer>> result = new ArrayList<>();

        if(exceptInd == pointer1) pointer1 += 1; 
        if(exceptInd == pointer2) pointer2 -= 1;
        int next1 = pointer1+1;
        if (next1== exceptInd){next1+=1;}
        int next2 = pointer2-1;
        if (next2== exceptInd){next2-=1;}
        
        if(nums[pointer1] + nums[next1]>target) return result;
        if(nums[pointer2] + nums[next2] < target ) return result;

        while(pointer1 < pointer2){
            int total = nums[pointer1] + nums[pointer2];
            if(total > target){
                pointer2 --;
                if(pointer2 == exceptInd) pointer2--;
            }else if(total < target){
                pointer1 ++;
                if(pointer1 == exceptInd) pointer1++;
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(nums[pointer1]);
                arr.add(nums[pointer2]);
                result.add(arr);
                pointer1++;
                if(pointer1 == exceptInd) pointer1 ++;
                pointer2--;
                if(pointer2 == exceptInd) pointer2--;
            }
        }
        return result;
    }
}
