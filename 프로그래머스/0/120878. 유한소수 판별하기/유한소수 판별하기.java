import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        for (int i = 2; i <= a; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                a = a / i;
                b = b / i;
            }
        }
        
        int b_num = b;
        while (b_num % 2 == 0) {
            b_num = b_num / 2;
        }
            
        while (b_num % 5 == 0) {
            b_num = b_num / 5;
        }
        
        if (b_num == 1) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}