class Solution {
    public int climbStairs(int n) {
        int[] m = new int[n+1];
        m[n] = 1;
        m[n-1] = 2;
        for(int i = n -2; i>= 1; i--){
            m[i] = m[i+2] + m[i+1];
        }

        return m[1];
    }
}
