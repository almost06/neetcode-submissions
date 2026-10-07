class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i = 0; i < s2.length()-s1.length()+1; i++){
            if(s1.contains(String.valueOf(s2.charAt(i)))){
                if(checkPermutation(s1, s2.substring(i, i + s1.length()))) return true;
            }
        }
        return false;
    }

    public boolean checkPermutation(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map.putIfAbsent(s1.charAt(i), 0);
            map.putIfAbsent(s2.charAt(i), 0);

            map.put(s1.charAt(i), map.get(s1.charAt(i)) +1);
            map.put(s2.charAt(i), map.get(s2.charAt(i)) -1);
        }
        for(var x: map.values()){
            if(x != 0) return false;
        }
        return true;
    }
}
