//The time complexity is O(n)
public class StockMaximizeDp {
    private static long stockMax(int[] prices){
        int n = prices.length;
        int peak = 0;
        int profit = 0;
        //go from the end
        for(int i = n - 1;i>=0;i--){
            //check and update the peak
            if(prices[i] >= peak){
                peak = prices[i];
            }
            //Sell the stock on the peak day and book profits
            profit += peak - prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
int[] prices = {1,2,100,5};
        System.out.println(stockMax(prices));
    }
}
