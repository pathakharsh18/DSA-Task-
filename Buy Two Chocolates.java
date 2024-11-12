class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int c=0;
        int sum=money;
        for(int i=0;i<2;i++){
          sum=sum-prices[i];
        }
        if(sum>=0){
            return sum;
        }
        return money;
    }
}
