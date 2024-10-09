import java.util.*;

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int newCoupon = chicken;
        int remainCoupon = 0;
        
        while (newCoupon + remainCoupon >= 10) {
            int tmp1 = (newCoupon + remainCoupon) / 10;
            int tmp2 = (newCoupon + remainCoupon) % 10;
            newCoupon = tmp1;
            remainCoupon = tmp2;
            answer += newCoupon;
            
        }
        
        return answer;
    }
}