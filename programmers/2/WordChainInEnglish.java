// 영어 끝말잇기 
import java.util.Arrays;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        for(int i = 1; i < words.length; i++) {
            String s1 = words[i-1];
            String s2 = words[i];
            String[] copy = Arrays.copyOfRange(words, 0, i);
            if(Arrays.asList(copy).contains(s2) || s1.charAt(s1.length()-1) != s2.charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        
        return answer;
    }
}
