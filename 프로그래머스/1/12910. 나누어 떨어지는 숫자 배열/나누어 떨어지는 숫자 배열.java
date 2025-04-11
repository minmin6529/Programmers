import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                num++;
            }
        }
        
        if (num == 0) {
            int[] arr1 = new int[]{-1};
            return arr1;
        }
        int[] answer = new int[num];
        
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[n] = arr[i];
                n++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}