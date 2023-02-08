// 가장 가까운 같은 글자

import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i + 1);
            map.put(ch, i);
        }
        
        return answer;
    }
}
