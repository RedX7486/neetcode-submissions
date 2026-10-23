class Solution {
    public int maxProfit(int[] prices) {
        
        int x;
        int profit = 0;
        int min = prices[0];
        for (int num : prices) {
            
            x = (num - min);
            if (x > profit){
                profit = x;
            }
            
            if (num < min){
                min = num;
            }
        }

        if (profit == 0){
            return 0;
        }

        return profit;

    }
}
