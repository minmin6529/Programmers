class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        for (int i = n; i >= 10; i-=10) {
            if (k > 0) {
                k -= 1;
            }    
        }
        
        answer = n*12000 + k*2000;
        return answer;
    }
}