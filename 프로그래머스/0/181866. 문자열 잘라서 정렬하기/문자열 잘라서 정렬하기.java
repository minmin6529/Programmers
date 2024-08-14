import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitStrings = myString.split("x");
		ArrayList<String> nonEmptyStrings = new ArrayList<>();

		for (String str : splitStrings) {
			if (!str.isEmpty()) {
				nonEmptyStrings.add(str);
			}
		}
		String[] answer = new String[nonEmptyStrings.size()];
		answer = nonEmptyStrings.toArray(answer);
		Arrays.sort(answer);
        return answer;
    }
}