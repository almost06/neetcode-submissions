class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int maxPrice = 0;
        for(int i = 1; i< prices.length; i++){
            if(prices[i] < smallest){
                smallest = prices[i]; 
            }else{
                if(maxPrice< prices[i]- smallest) maxPrice = prices[i] - smallest;
            }
        }
        return maxPrice;
    }
}
