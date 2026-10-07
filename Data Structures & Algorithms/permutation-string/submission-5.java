class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] m1 = new int[26];
        int[] m2 = new int[26];
        
        if(s2.length()<s1.length()) return false;

        for(int i = 0; i < s1.length(); i++){
            m1[s1.charAt(i)-'a'] +=1;
            m2[s2.charAt(i)-'a'] +=1;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            if(Arrays.equals(m1, m2)) return true;
            m2[s2.charAt(i-s1.length())-'a'] -=1;
            m2[s2.charAt(i)-'a'] +=1;
        }

        if(Arrays.equals(m1, m2)) return true;
        return false;
    }
}
