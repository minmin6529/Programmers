import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = "";
        s = my_string.toLowerCase();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        answer = String.valueOf(c);
        return answer;
    }
}