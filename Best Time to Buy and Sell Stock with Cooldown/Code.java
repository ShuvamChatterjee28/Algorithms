class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length<=1) { return 0; }
        int profit = 0, bought = (0-prices[0]), selloutPrice = Integer.MIN_VALUE; 
        for(int i = 1; i < prices.length; i++){
            int prevProfit = profit, prevBought = bought;
            profit = Math.max(profit, selloutPrice);
            bought = Math.max(bought, prevProfit-prices[i]);
            selloutPrice = prevBought+prices[i];
        }
        return Math.max(profit, selloutPrice);
    }
}