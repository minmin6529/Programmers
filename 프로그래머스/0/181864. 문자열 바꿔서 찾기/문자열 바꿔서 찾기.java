class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myString1 = "";
        for (String s : myString.split("")) {
            if (s.equals("A")) {
                myString1 += "B";
            } else {
                myString1 += "A";
            }
        }
        if (myString1.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}