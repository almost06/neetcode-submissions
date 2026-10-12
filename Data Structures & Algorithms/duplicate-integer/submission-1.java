class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        for(var x: nums){
            if(!n.add(x)) return true;
        }
        return false;

    }
}