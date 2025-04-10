import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            long idx = left + i;
            answer[i] = (int)(Math.max(idx / n, idx % n) + 1);
        }
        
        return answer;
    }
}