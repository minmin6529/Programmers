import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String st = s;
        int cnt = 0;
        int length = 0;
        int num = 0;
        
        while (!st.equals("1")) {
            cnt += countZero(st);
            st = st.replaceAll("0", "");
            length = st.length();
            st = Integer.toBinaryString(length);
            num++;
        }
        
        answer[0] = num;
        answer[1] = cnt;
        return answer;
    }
    
    public static int countZero(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }
}