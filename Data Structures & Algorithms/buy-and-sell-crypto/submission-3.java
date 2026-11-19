class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int sell: prices){
            minPrice = Math.min(minPrice, sell);
            maxProfit = Math.max(sell-minPrice, maxProfit);
        }
        return maxProfit;
    }
}
