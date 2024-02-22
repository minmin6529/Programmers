import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        
        String reverse = "";
        String answer = "";
        int n = 0;
        for (int i = s; i <= e; i++) {
            reverse = reverse + my_string.charAt(e - n);
            n++;
        }
        answer = my_string.substring(0, s) + reverse + my_string.substring(e + 1, my_string.length());
        return answer;
    }
}