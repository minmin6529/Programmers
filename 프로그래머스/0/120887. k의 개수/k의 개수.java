import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char kk = Integer.toString(k).charAt(0);
            
        for (int m = i; m <= j; m++) {
            String mm = Integer.toString(m);
            for (int n = 0; n < mm.length(); n++) {
                if (mm.charAt(n) == kk) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}