import java.util.*;

class Solution {
    public int[] solution(int n) {
        int num = 1;
        int m = n;
        while (m != 1) {
            if (m % 2 == 0) {
                m = m / 2;
                num++;
            } else {
                m = 3 * m + 1;
                num++;
            }
        }
        int[] answer = new int[num];
        answer[0] = n;
        int cnt = 1;
        int t = n;
        while (t != 1) {
            if (t % 2 == 0) {
                t = t / 2;
                answer[cnt++] = t;
            } else {
                t = 3 * t + 1;
                answer[cnt++] = t;
            }
        }
        return answer;
    }
}