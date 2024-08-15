import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] str = new String[3];
        int cnt = 0;
        for (String s : binomial.split(" ")) {
            str[cnt++] = s;
        }
        
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        
        if (str[1].equals("+")) {
            answer = num1 + num2;
        } else if (str[1].equals("-")) {
            answer = num1 - num2;
        } else if (str[1].equals("*")) {
            answer = num1 * num2;
        }
        
        return answer;
    }
}