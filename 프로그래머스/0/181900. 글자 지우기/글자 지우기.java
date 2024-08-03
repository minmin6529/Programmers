import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int num = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    num = 1;
                }
            }
            if (num == 0) {
                answer += my_string.charAt(i);
            }
            num = 0;
        }
        
        return answer;
    }
}