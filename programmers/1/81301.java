import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(replaceNumber(s));
    
        return answer;
    }
    
    public static String replaceNumber(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(String str : arr) {
            String index = String.valueOf(Arrays.asList(arr).indexOf(str)); 
            s = s.replaceAll(str, index);
        }
        
        return s;
    }
}
