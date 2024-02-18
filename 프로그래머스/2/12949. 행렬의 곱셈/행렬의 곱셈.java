import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr2[0].length;
        int[][] answer = new int[row][col];
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[j][i] += arr1[j][k]*arr2[k][i]; 
                }
            }
        }
        
        return answer;
    }
}