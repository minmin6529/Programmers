import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int num = array.length / 2;
        int answer = array[num];
        System.out.println(Arrays.toString(array));
        return answer;
    }
}