class Solution {
    public int maxProfit(int[] prices) {

        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=0;i<=prices.length-1;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            int max=prices[i];
            int profit=max-minPrice;

            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
        
    }
}