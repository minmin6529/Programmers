import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture[0].length();
        int num = 0;
        String[] answer = new String[picture.length*k];
        for (int i = 0; i < picture.length; i++) {
            String s = "";
            for (int j = 0; j < len; j++) {
                for (int m = 0; m < k; m++) {
                    s += picture[i].charAt(j);
                }
            }
            for (int m = 0; m < k; m++) {
                answer[num] = s;
                num++;
            }
        }
        return answer;
    }
}