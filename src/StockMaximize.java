//Brute Force solution where worst case time complexity is O(n*n)
public class StockMaximize {
    private static long showMax(int[] prices){
        int n = prices.length;
        int profit = 0;

        for(int i = 0; i < n;i++){
            int peak = 0;
            //Find the peak from the rest of the array
            for(int j = i;j < n;j++){
                //If new peak found, update peak
                if(prices[j] > peak){
                    peak = prices[j];
                }
                //sell on this peak day and book profits

            }
            profit = profit + peak - prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
 int[] prices ={1,3,4,2,1};
        System.out.println(showMax(prices));
    }
}
