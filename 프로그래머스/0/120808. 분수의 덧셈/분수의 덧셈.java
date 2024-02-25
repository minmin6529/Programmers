import java.util.*;

class Solution {
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {           
        int[] answer = new int[2];
        int gcd = getGCD(denom1, denom2);
        int lcm = (denom1 * denom2) / gcd;
        int numer = (lcm / denom1)*numer1 + (lcm / denom2)*numer2;
        int denom = lcm;
        int regcd = getGCD(numer, denom);
        answer[0] = numer / regcd;
        answer[1] = denom / regcd;
        return answer;
    }
    
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}