import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger s = numA.add(numB);
            
        String answer = s.toString();
        return answer;
    }
}