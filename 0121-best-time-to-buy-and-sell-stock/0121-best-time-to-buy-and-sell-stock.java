class Solution {
    public int maxProfit(int[] prices) {
        int maxprice = prices[0];
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            maxprofit = Math.max(maxprofit, prices[i] - maxprice);
            maxprice = Math.min(maxprice, prices[i]);
        }
        return maxprofit;
    }
}