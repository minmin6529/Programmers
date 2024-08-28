import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int i = 0; i < queries.length; i++) {
            int a = answer[queries[i][0]];
            int b = answer[queries[i][1]];
            answer[queries[i][0]] = b;
            answer[queries[i][1]] = a;
        }
        
        return answer;
    }
}