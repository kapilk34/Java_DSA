package Arrays;

public class BuyAndSell {
    public static int BestBuyAndSell(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BestBuyAndSell(prices));
    }
}
