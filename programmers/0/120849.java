class Solution {
    public String solution(String my_string) {
	// 'a','e','i','o','u' 를 공백으로 변경
        String answer = my_string.replaceAll("[a,e,i,o,u]","");
        return answer;
    }
}
