import java.util.*;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int num = hp;
        for (int i = num-5; i >= 0; i-=5) {
            answer++;  
            num = i;
        }
        for (int i = num-3; i >= 0; i-=3) {
            answer++;  
            num = i;
        }
        for (int i = num-1; i >= 0; i-=1) {
            answer++;  
            num = i;
        } 
        return answer;
    }
}