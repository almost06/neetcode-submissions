class Solution {
    public boolean isAnagram(String s, String t) {
        int[] n = new int[26];
        for(int i = 0; i < s.length(); i++){
            var l = s.charAt(i);
            n[l-'a'] +=1;
        }
        for(int i = 0; i < t.length(); i++){
            var l = t.charAt(i);
            n[l-'a'] -=1;
        }
        for(var x : n){
            if(x != 0) return false; 
        }
        return true;
    }
}
