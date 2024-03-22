class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                num++;
            }
        }
        answer = new int[num];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}