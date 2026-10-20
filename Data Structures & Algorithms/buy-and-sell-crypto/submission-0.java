class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = Integer.MIN_VALUE;
        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }
            else{
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            }
            right++;
        }    
        return Math.max(maxProfit, 0);
    }
}
