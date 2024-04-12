import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int num = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
            } else {
                num++;
            }
        }
        answer = new String[num];
        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
            } else {
                answer[cnt] = strArr[i];
                cnt++;
            }
        }
        return answer;
    }
}