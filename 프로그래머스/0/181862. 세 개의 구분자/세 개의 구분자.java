import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (!sb.toString().equals("")) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(c);
            }
        }
        
        if (!sb.toString().equals("")) {
            list.add(sb.toString());
        }
        
        if (list.size() == 0) {
            return new String[]{"EMPTY"};
        }
        
        return list.stream().toArray(String[]::new);
    }
}