import java.util.*;

class Solution {
    private static class State {
        public final int index;
        public final int acc;
        
        State(int index, int acc) {
            this.index = index;
            this.acc = acc;
        }
    }
    
    public int solution(int[] numbers, int target) {
        Stack<State> s = new Stack<>();
        s.push(new State(0, 0)); // 초기 상태
        
        int count = 0;
        
        while (!s.isEmpty()) { // 탐색 진행
            State state = s.pop();
            // state 처리
            if (state.index == numbers.length) {
                if (state.acc == target) count++;
                continue;
            }
            
            // 상태전이
            // +를 선택한 경우
            s.push(new State(state.index + 1, state.acc - numbers[state.index]));
            // -를 선택한 경우
            s.push(new State(state.index + 1, state.acc + numbers[state.index]));  
        }
    
        return count;
    }
}