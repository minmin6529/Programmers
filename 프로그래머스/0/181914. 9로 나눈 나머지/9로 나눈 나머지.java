import java.util.*;
import java.math.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        BigInteger n = new BigInteger(number);
        BigInteger a = n.remainder(BigInteger.valueOf(9));
        answer = a.intValue();
        return answer;
    }
}