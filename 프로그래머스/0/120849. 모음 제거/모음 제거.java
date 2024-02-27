import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String s : my_string.split("")) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                continue;
            }
            answer += s;
        }
        return answer;
    }
}