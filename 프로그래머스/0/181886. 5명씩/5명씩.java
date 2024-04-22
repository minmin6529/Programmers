import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int num = 0;
        if (names.length % 5 == 0) {
            num = names.length / 5;
        } else {
            num = names.length / 5 + 1;
        }
        answer = new String[num];
        int cnt = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[cnt] = names[i];
                cnt++;
            }
        }
        return answer;
    }
}