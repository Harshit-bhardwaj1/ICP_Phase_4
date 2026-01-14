
public class Best_Time_to_Buy_and_Sell_Stock{
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices){
        int  minPrice= Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit= Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
}