class Solution {
    public boolean isPalindrome(String s) {
        var t = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int pointerInd1 = 0;
        int pointerInd2 = t.length() -1;
        while(pointerInd1 < pointerInd2){
            if(t.charAt(pointerInd1) != t.charAt(pointerInd2)){
                return false;
            }
            pointerInd1++;
            pointerInd2--;
        }
        return true;
    }
}
