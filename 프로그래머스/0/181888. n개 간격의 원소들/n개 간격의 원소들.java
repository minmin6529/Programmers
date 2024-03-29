class Solution {
    public int[] solution(int[] num_list, int n) {
        int num = 0;
        int cnt = 0;
        
        if (num_list.length % n == 0) {
            num = num_list.length / n;
        } else {
            num = num_list.length / n + 1;
        }
        int[] answer = new int[num];
        
        for (int i = 0; i < num_list.length; i+=n) {
            answer[cnt] = num_list[i];
            cnt++;
        }
        return answer;
    }
}