import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int num = 0;
        for (String s : my_string.split(" ")) {
            if (s.isBlank()) {
            } else {
                num++;
            }
        }
        answer = new String[num];
        int cnt = 0;
        for (String s : my_string.split(" ")) {
            if (s.isBlank()) {
            } else {
                answer[cnt] = s;
                cnt++; 
            }  
        }        
        return answer;
    }
}