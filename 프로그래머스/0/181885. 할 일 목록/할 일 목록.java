class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int[] number = new int[finished.length];
        int num = 0;
        int cnt = 0;
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                num++;
                number[cnt] = i;
                cnt++;
            }
        }
        answer = new String[num];
        System.out.println(num);
        int n = 0;
        for (int i = 0; i < todo_list.length; i++) {
            for (int j = 0; j < num; j++) {
                if (i == number[j]) {
                    answer[n] = todo_list[i];
                    n++;
                }
            }
        }
        return answer;
    }
}