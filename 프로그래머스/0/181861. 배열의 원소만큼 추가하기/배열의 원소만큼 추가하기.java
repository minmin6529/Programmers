class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        answer = new int[num];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        return answer;
    }
}