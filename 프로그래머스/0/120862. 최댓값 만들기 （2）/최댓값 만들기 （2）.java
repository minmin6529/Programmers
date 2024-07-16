import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int negativeNumberMul = numbers[0] * numbers[1]; // 가장 작은 두 수의 곱셈
        int positiveNumberMul = numbers[numbers.length-1] * numbers[numbers.length-2]; // 가장 큰 두 수의 곱셈
        if (negativeNumberMul > positiveNumberMul) {
            return negativeNumberMul;
        }
        return positiveNumberMul;
    }
}