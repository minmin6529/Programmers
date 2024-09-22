import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 100;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (diff == Math.abs(array[i] - n)) {
                
            } else if (diff > Math.abs(array[i] - n)) {
                diff = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        return answer;
    }
}