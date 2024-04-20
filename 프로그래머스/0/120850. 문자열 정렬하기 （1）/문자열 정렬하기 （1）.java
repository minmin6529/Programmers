import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int num = 0;
        char c;
        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);
            if (c < 48 || c > 58) {
            } else {
                num++;
            }
        }
        answer = new int[num];
        int cnt = 0;
        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);
            if (c < 48 || c > 58) {
            } else {
                answer[cnt] = Character.getNumericValue(c);
                cnt++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}