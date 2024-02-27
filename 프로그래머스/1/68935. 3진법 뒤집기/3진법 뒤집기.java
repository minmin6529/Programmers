import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String n1 = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(n1);
        String n2 = sb.reverse().toString();
        int n3 = Integer.parseInt(n2, 3);
        answer = n3;
        return answer;
    }
}