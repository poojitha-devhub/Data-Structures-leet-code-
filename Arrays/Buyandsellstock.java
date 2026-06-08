package Arrays;

public class Buyandsellstock {
    public static int max_profit(int prices[]){
        int maximum_profit=0;
        int buy_price=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){
                int profit=prices[i]-buy_price;
                maximum_profit=Math.max(maximum_profit,profit);
            }
            else{
                buy_price=prices[i];
            }
        }
        return maximum_profit;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int ans=max_profit(prices);
        System.out.println("Maximum profit: "+ans);
        
    }
    
}
