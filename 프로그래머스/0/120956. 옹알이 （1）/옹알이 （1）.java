import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                babbling[i] = babbling[i].replace(str[j], " ");
            }

            // trim() : 문자열 앞뒤 공백 제거
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
