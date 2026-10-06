class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0; 
        int start = 0;
        for(int end = 0; end < s.length(); end++){
            while(end < s.length() && set.add(s.charAt(end))){
                end++;
            }

            if(max<end-start) max = end - start;
            if(end >= s.length()) return max;

            while(start <= end && !set.add(s.charAt(end))){
                var t = s.charAt(start); 
                set.remove(t);
                start++;
            }

        }

        return max;
    }
}
