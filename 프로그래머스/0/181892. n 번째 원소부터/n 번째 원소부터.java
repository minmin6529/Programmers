import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int num = num_list.length - n + 1;
        int cnt = 0;
        int[] answer = new int[num];
        for (int i = n - 1; i < num_list.length; i++) {
            answer[cnt] = num_list[i];
            cnt++;
        }
        return answer;
    }
}