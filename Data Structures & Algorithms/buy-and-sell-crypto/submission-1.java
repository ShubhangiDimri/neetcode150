class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=0;
        int size= prices.length;
        int profit=0;
        while(j<size){

            if(prices[j]>= prices[i]){
                profit= Math.max(profit, prices[j]-prices[i]);
            }else{
                i=j;
            }
            j++;
        }
        return profit;
    }
}
