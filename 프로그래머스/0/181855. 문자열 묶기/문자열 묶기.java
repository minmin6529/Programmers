import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int cnt []  = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            String s = strArr[i];
            cnt[s.length() - 1] += 1;
        }
        
        int max = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
            }
        }
        answer = max;
        
        return answer;
    }
}