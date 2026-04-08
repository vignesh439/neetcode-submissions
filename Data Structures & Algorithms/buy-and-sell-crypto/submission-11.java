class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length < 2) {
            return 0;
        }

        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            else {
                maxProfit = Math.max(prices[i] - min, maxProfit);
            }
        }

        return maxProfit;
    }
}
