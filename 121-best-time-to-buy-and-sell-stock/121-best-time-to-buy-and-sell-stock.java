
class Solution {
    public int maxProfit(int[] prices) {

        // 1. 가장 작은 값과 return 값을 설정해주어야 함 ()
        int min = Integer.MAX_VALUE;
        int maxReturn = Integer.MIN_VALUE;
        
        //2. 루프를 돌리면서 작은 값과 return 값을 계속 변경해주어야함
        for(int price : prices) {
            //3. min 값은 Math.min을 사용해서 변경 해주자.
            min = Math.min(min, price);
            //4. maxReturn 값은, 최대 이득을 나타내야함
            // min값은 배열에서 가장 작은 값으로 설정됨
            // 따라서 현재 price에서 min을 뺀 값을 maxReturn에 주면됨
            // maxReturn은 최대 이득을 나타내줌.
            maxReturn = Math.max(maxReturn, price-min );
        }
        return maxReturn;
        
    }
}