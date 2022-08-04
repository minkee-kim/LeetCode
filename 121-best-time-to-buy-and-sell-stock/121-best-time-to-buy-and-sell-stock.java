
class Solution {
    public int maxProfit(int[] prices) {
    //Math.max와 Math.min을 사용하지 않고 해보기
        
        int min=prices[0], max=0, temp=0;
        
        for(int i=1,j=prices.length;i<j;i++) {
            if(prices[i]<min) {
                min=prices[i];
            }
            
            temp = prices[i]-min;
            
            if(temp>max) {
                max=temp;
            }
        }
        return max;
        
    }
}