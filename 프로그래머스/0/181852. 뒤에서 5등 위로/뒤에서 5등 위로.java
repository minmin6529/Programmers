import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int max = 0;
        int num = 0;
        for (int i = 0; i < num_list.length - 5; i++) {
            for (int j = 0; j < num_list.length; j++) {
                if (max < num_list[j]) {
                    max = num_list[j];
                    num = j;
                }
            }
            answer[i] = max;
            num_list[num] = 0;
            max = 0;
        }
        Arrays.sort(answer);
        return answer;
    }
}