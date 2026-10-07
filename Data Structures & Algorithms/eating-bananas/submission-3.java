class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end = 0; 
        int start = 1; 
        for(var p: piles){
            if(end<p) end = p;
        }

        while(start<end){
            int half = start + (end - start)/2;
            long hour = 0;
            for(var p: piles){
                hour += (p + half - 1) / half;
            }
            if(hour<= h) end = half;
            else start = half +1;
        }

        return end;
    }
}
