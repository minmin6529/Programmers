import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int [] ad = new int[included.length];
        ad[0] = a;
        for (int i = 1; i < included.length; i++) {
            ad[i] = ad[i - 1] + d;
        }
        
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += ad[i];
            }
        }
        
        return answer;
    }
}