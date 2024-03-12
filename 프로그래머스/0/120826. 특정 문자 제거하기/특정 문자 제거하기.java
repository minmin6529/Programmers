class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String m = Character.toString(my_string.charAt(i));
            if (m.equals(letter)) {
            } else {
                answer += m;
            }
        }
        return answer;
    }
}