class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(new HashSet<Integer>(), new ArrayList<Integer>(), nums);
        return list;
    }

    public void backtrack(HashSet<Integer> set, List<Integer> l, int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(set.add(nums[i])) l.add(nums[i]);
            else continue;

            if(l.size() == nums.length) list.add(new ArrayList<>(l));
            backtrack(set, l, nums);
            l.removeLast();
            set.remove(nums[i]);
        }
    }


}
