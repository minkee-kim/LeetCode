
class Solution {
    public int maxProfit(int[] prices) {
        // 작은 값과 return 해줄 max값이 필요
        // 루프를 돌리면서 계속 값을 비교하며 업데이트해야 함.
        int min = prices[0];
        int max = 0;
        
        // min은 prices[i] 보다 작다면 그 값으로 변경해야 한다.
        // prices[i]-min과 max 중 더 큰 값을 찾는 이유는 결국 최대 이윤을 찾아야 하기 때문.
        // prices[i]-min 중 최대값이 최대 이윤이다. 
    
        for(int i=1,j=prices.length; i<j; i++) {
            if(prices[i] < min ) {
                min = prices[i];
            } max = Math.max(max, prices[i]-min);
        }
        return max;
        
    }
}