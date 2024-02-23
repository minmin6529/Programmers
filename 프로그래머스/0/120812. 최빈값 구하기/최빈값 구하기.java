import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] sum = new int[1000];
        int max = 0;
        int isMultiple = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum[array[i]]++;
            
            if (max < sum[array[i]]) {
                max = sum[array[i]];
                answer = array[i];
            }
        }
        
        for (int i = 0; i < sum.length; i++) {
            if (max == sum[i]) {
                isMultiple++;
            }
            if (isMultiple > 1) {
                answer = -1;
            }
        }
        
        return answer;
    }
}