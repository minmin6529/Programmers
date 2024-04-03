import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int resum = Integer.parseInt(Integer.toString(b) + Integer.toString(a));;
        if (sum > resum) {
            answer = sum;
        } else {
            answer = resum;
        }
        return answer;
    }
}