class Solution {
    public boolean checkInclusion(String s1, String s2) {

        for(int i = 0; i < s2.length()-s1.length()+1; i++){
            if(s1.contains(String.valueOf(s2.charAt(i)))){
                var ss = sortString(s2.substring(i, i + s1.length())); 
                if(ss.equals(sortString(s1))) return true;
            }
        }
        return false;
    }

    public String sortString(String s){
        var x = s.toCharArray(); 
        Arrays.sort(x);
        return new String(x);
    }
}
