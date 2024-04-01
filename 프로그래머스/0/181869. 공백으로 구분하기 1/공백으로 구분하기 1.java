class Solution {
    public String[] solution(String my_string) {
        int num = 0;
        for (String s : my_string.split(" ")) {
            num++;
        }
        String[] answer = new String[num];
        int cnt = 0;
        for (String s : my_string.split(" ")) {
            answer[cnt] = s;
            cnt++;
        }
        return answer;
    }
}