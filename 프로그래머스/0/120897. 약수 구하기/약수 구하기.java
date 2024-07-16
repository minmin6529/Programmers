class Solution {
    public int[] solution(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                num++;
            }
        }
        int[] answer = new int[num];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}