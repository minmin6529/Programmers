import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int minus = 0;
        for (int i = 0; i < numLog.length; i++) {
            if (i + 1 >= numLog.length) {
                break;
            }
            minus = numLog[i + 1] - numLog[i];
            if (minus == 1) {
                answer += "w";
            } else if (minus == -1) {
                answer += "s";
            } else if (minus == 10) {
                answer += "d";
            } else if (minus == -10) {
                answer += "a";
            }
        }
        
        return answer;
    }
}