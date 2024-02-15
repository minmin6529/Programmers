import java.util.*;

class Solution {
    public int[] solution(long n) {
        char[] cArray = Long.toString(n).toCharArray();
        int[] answer = new int[cArray.length];
        int cnt = 0;
        
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = Character.getNumericValue(cArray[cnt]);
            cnt++;
        }
        return answer;
    }
}