import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        String n1 = new_id.toLowerCase();
        
        // 2단계
        String match = "[^a-z0-9-_.]";
        String n2 = n1.replaceAll(match, "");
        
        // 3단계
        String n3 = n2;
        n3 = n3.replaceAll("\\.{2,}", ".");
        
        // 4단계
        String n4 = n3;
        if (n3.charAt(0) == '.') {
            n4 = n3.replaceFirst(".", "");
        }
        if (!n4.isEmpty() && n4.charAt(n4.length() - 1) == '.') {
            n4 = n4.substring(0, n4.length() - 1);
        }
        
        // 5단계
        String n5 = n4;
        if (n5.equals("")) {
            n5 += "a";
        }
        
        // 6단계
        String n6 = n5;
        if (n6.length() >= 16) {
            n6 = n6.substring(0, 15);
        }
        if (!n6.isEmpty() && n6.charAt(n6.length() - 1) == '.') {
            n6 = n6.substring(0, n6.length() - 1);
        }
        
        // 7단계
        String n7 = n6;
        if (n7.length() <= 2) {
            for (int i = n7.length(); i < 3; i++) {
                n7 += n7.charAt(n7.length() - 1);
            }
        }
        
        answer = n7;
        return answer;
    }
}
