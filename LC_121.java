class Solution {
    public int maxProfit(int[] prices) {
        int res=0,min=prices[0],max=0,i;
        for(i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                res=prices[i]-min;
                if(res>max){
                    max=res;
                }
            }
        }
        return max;
        
    }
}
