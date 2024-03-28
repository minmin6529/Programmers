class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.replace('a', 'A');
        for (String s : myString.split("")) {
            if (s.equals("A")) {
                answer += s;
            } else {
                answer += s.toLowerCase();
            }
        }
        return answer;
    }
}