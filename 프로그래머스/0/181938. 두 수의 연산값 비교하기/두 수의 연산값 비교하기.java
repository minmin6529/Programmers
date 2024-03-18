class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int mul = 2 * a * b;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String sum = str1 + str2;
        int sum2 = Integer.parseInt(sum);
        
        if (mul == sum2) {
            answer = sum2;
        } else if (mul > sum2) {
            answer = mul;
        } else {
            answer = sum2;
        }
        
        return answer;
    }
}