import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int cnt = 0;
        for (int i = 0; i < start - end_num + 1; i++) {
            answer[cnt] = start - i;
            cnt++;
        }
        return answer;
    }
}