import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += c;
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                cnt++;
            }
        }

        return answer;
    }
}