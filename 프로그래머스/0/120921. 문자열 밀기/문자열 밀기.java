import java.util.*;

class Solution {
    public int solution(String A, String B) {
        
        int answer = 0;
        String s1 = "";
        String s2 = "";
        Boolean bool = false;
        
        if (A.equals(B)) {
            return 0;
        }

        for (int i = 0; i < A.length(); i++) {
            s1 = A.substring(A.length() - i - 1, A.length());
            s2 = A.substring(0, A.length() - i - 1);
            answer++;
            if ((s1 + s2).equals(B)) {
                bool = true;
                return answer;
            }
        }
        
        if (!bool) {
            return -1;
        }
        
        return answer;
    }
}