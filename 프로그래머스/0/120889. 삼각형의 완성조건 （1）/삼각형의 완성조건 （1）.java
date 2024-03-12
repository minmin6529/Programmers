class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int num = 0;
        
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
                num = i;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            if (i == num) {
            } else {
                sum += sides[i];
            }
        }
        
        if (sum > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}