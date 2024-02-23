import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int num = 0;
        
        if (my_str.length() % n == 0) {
            num = my_str.length() / n;
        } else {
            num = my_str.length() / n + 1;
        }
        
        String[] answer = new String[num];
        int start = 0;
        int end = n;
        
        for (int i = 0; i < num; i++) {
            if (end > my_str.length()) {
                end = my_str.length();
            } 
            answer[i] = my_str.substring(start, end);
            start = end;
            end += n;
        }
        
        return answer;
    }
}