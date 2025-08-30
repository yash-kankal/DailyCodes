class Solution {
    public int maxProfit(int[] prices) {
        
        int maxPro = 0;
        int minPrice = prices[0];

        for(int i = 0; i < prices.length; i++) {
            maxPro = Math.max(maxPro, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxPro;
    }
}