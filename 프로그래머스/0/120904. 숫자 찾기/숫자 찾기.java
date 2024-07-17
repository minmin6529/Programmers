class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == Integer.toString(k).charAt(0)) {
                answer = i + 1;
                return answer;
            }
        }
        return -1;
    }
}